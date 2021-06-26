package com.blockchain.blockchain_manage.Repository;

import com.blockchain.blockchain_manage.bean.memberGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<memberGroup,String> {
}
