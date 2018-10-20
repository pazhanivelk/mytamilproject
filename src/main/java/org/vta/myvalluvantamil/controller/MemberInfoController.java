package org.vta.myvalluvantamil.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.vta.myvalluvantamil.model.MemberInfo;

@RestController
public class MemberInfoController {

    @GetMapping("/vta/member/{id}")
    @ResponseBody
    public MemberInfo getMember(@PathVariable("id") long memberId){
        return new MemberInfo();
    }
}
