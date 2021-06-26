package com.blockchain.blockchain_manage.controller;


import com.blockchain.blockchain_manage.bean.memberData;
import com.blockchain.blockchain_manage.manger.memberManger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    memberManger memberManger;

    @GetMapping
    public memberData getMemberData(String name,String appId,String ip){
        return memberManger.memberData(name,appId,ip);
    }
}
