package org.vta.myvalluvantamil.model;

import javax.persistence.Entity;
import javax.persistence.Table;

public class MemberInfo extends BaseModel {
    private String Integer;

    private String regId;
    private String memberName;
    private String spouseName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String altPhone;
    private String email;
    private String spouseEmail;
    private String emergencyPhone;
    private String emergencyPhone2;
    private String registerDate;
    private String activeInd;
    private String updatedAt;
    private String updatedBy;
    private String volunteerHours;
    private String acceptTerms;

    public String getInteger() {
        return Integer;
    }

    public void setInteger(String integer) {
        Integer = integer;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAltPhone() {
        return altPhone;
    }

    public void setAltPhone(String altPhone) {
        this.altPhone = altPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpouseEmail() {
        return spouseEmail;
    }

    public void setSpouseEmail(String spouseEmail) {
        this.spouseEmail = spouseEmail;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public String getEmergencyPhone2() {
        return emergencyPhone2;
    }

    public void setEmergencyPhone2(String emergencyPhone2) {
        this.emergencyPhone2 = emergencyPhone2;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getActiveInd() {
        return activeInd;
    }

    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getVolunteerHours() {
        return volunteerHours;
    }

    public void setVolunteerHours(String volunteerHours) {
        this.volunteerHours = volunteerHours;
    }

    public String getAcceptTerms() {
        return acceptTerms;
    }

    public void setAcceptTerms(String acceptTerms) {
        this.acceptTerms = acceptTerms;
    }
}