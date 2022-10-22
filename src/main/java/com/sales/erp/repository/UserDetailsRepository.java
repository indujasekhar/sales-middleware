package com.sales.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sales.erp.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

	@Query(value="from UserDetails where userTypeId=:userTypeId")
	public List<UserDetails> getAllUsersByType(@Param("userTypeId") int id);
}
