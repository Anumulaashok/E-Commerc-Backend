package com.example.demo.Service;

import com.example.demo.Exceptions.UserException;

public interface LogInService {
	
	public String login(String username,String password) throws UserException;
	public String logOut(String username,String password)throws UserException;

}
