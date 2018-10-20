package org.vta.myvalluvantamil.model;

import org.springframework.beans.BeanUtils;
import org.vta.myvalluvantamil.annotations.Column;
import org.vta.myvalluvantamil.annotations.Entity;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class BaseModel {


    private String getTableName(){
        return this.getClass().getAnnotation(Entity.class).tableName();
    }

    private Map<String, String> extractColumns(){
        Map<String, String> columnsMap = new HashMap<>();
        Field[] fields = this.getClass().getDeclaredFields();
        Stream.of(fields).filter(field -> field.isAnnotationPresent(Column.class))
                .forEach(field -> {
                    Column column = field.getAnnotation(Column.class);
                    String columnName = column.column();
                    String dataType = column.dataType();
                    columnsMap.put(columnName, dataType);
                });
        return columnsMap;
    }

    private Map<String, Object> extractColumnValues(){
        Map<String, Object> columnsMap = new HashMap<>();
        Field[] fields = this.getClass().getDeclaredFields();
        Stream.of(fields).filter(field -> field.isAnnotationPresent(Column.class))
                .forEach(field -> {
                    Column column = field.getAnnotation(Column.class);
                    String columnName = column.column();
                    try{
                        PropertyDescriptor descriptor = BeanUtils.getPropertyDescriptor(this.getClass(), field.getName());
                        Method getter = descriptor.getReadMethod();
                        Object value = (Object) getter.invoke(this);
                        if (value != null ){
                            //columnsMap.put(column, value);
                        }
                    }
                    catch(Exception ex){
                        ex.printStackTrace();
                    }
                });
        return columnsMap;
    }

    private String getSearchQuery () {

        Map<String, String> columnsMap = extractColumns();
        Map<String, Object> columnValues = extractColumnValues();
        StringBuffer selectQuery = new StringBuffer();
        selectQuery.append(" select ");
        Boolean first = false;
        columnsMap.forEach((k, v) ->{
            if (!first) {
                selectQuery.append(",");
            }
            selectQuery.append( k );
        } );
        selectQuery.append( " from " + getTableName() + " where ");
        columnValues.forEach((k, v) ->{
            if (!first) {
                selectQuery.append(" and ");
            }
            selectQuery.append( k + "=? " );

        } );
        return selectQuery.toString();

    }

    public List<BaseModel> queryForList(){
    	return null;
    	

    }

    public BaseModel queryForObject(){
    	
    	return null;

    }

    public String getInsertQuery(){

    	return null;
    }

    private String getUpdateQuery(){

    	return null;
    }
}
