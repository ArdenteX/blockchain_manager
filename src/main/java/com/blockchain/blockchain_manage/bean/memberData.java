package com.blockchain.blockchain_manage.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
public class memberData{
    private String msg;
    private String code;
    private List<Member> members;
}
