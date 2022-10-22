package com.sales.erp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.erp.entity.UserType;

@Repository
@Transactional
public interface UserTypeRepository extends JpaRepository<UserType, Integer> {

}
