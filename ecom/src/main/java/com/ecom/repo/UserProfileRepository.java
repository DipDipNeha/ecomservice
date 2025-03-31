package com.ecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.entity.UserProfile;
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

	
	public UserProfile findByNameAndPasswordAndRoleAndSecQuesAndSecAns(String name,String password,String role,String secQues,String secAns);
	;
}
