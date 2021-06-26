package com.blockchain.blockchain_manage.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class memberGroup {
    @Id
    private String groupId;
    private String groupName;
}
