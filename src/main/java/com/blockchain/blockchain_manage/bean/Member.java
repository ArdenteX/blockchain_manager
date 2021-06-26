package com.blockchain.blockchain_manage.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Member{
    @Id
    private String appId;
    private String name;
    //可以让客户端自动获取
    private String ip;
    private String groupId;
    private String createTime;
    private String updateTime;

    public String toString(){
        return "appId="+appId+
                "name="+name+
                "ip="+ip+
                "createTime="+createTime+
                "updateTime="+updateTime;
    }
}
