package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.LoginDTO;

@Repository
public interface LogInDao extends JpaRepository<LoginDTO, String>{

	public LoginDTO findByEmail(String email);
	
}
