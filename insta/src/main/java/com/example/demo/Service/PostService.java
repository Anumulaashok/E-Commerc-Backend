package com.example.demo.Service;

import java.util.List;

import com.example.demo.Exceptions.PostException;
import com.example.demo.Model.Post;

public interface PostService {

	public Post AddPost(Post post)throws PostException;
	
	public List<Post> getAllPost()throws PostException;
	
	public Post getPostById(Integer id)throws PostException;
	
	public Post deletePost(Integer id)throws PostException;
}
