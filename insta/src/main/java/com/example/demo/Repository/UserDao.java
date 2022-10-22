package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

	public 	User findByEmail(String email);
	
	@Query("from User where userName like %?1%")
	public List<User> GetUserByName(String userName);
	
	public User findByUserName(String userName);
}
