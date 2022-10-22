package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exceptions.PostException;
import com.example.demo.Model.Post;
import com.example.demo.Repository.LogInDao;
import com.example.demo.Repository.PostDao;
import com.example.demo.Repository.UserDao;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	private UserDao ud;
	@Autowired
	private PostDao pd;
	@Autowired
	private LogInDao ld;

	@Override
	public Post AddPost(Post post)throws PostException {
		
		
		
		return null;
	}

	@Override
	public List<Post> getAllPost()throws PostException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPostById(Integer id) throws PostException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post deletePost(Integer id)throws PostException {
		// TODO Auto-generated method stub
		return null;
	}

}
