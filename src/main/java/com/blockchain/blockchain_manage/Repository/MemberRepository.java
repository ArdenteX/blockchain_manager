package com.blockchain.blockchain_manage.Repository;

import com.blockchain.blockchain_manage.bean.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,String> {
    Member findFirstByAppId(String AppId);

    Member findFirstByName(String name);

    List<Member> findByGroupId(String groupId);
}
