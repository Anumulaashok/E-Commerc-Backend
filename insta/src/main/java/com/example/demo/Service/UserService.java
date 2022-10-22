package com.example.demo.Service;

import java.util.List;

import com.example.demo.Exceptions.UserException;
import com.example.demo.Model.Post;
import com.example.demo.Model.User;

public interface UserService {

	public User saveUser(User user)throws UserException;
	
	public String updatePassword(String email,String Currentpassword, String password)throws UserException;
	
	public List<User> getUserByName(String userName)throws UserException;
	
	public String deleteUser(String email, String password)throws UserException;
	
	public String AddPost(String email, Post post);
	
}
