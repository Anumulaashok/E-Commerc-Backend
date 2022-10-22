package com.example.demo.Service;

import com.example.demo.Exceptions.CommentException;
import com.example.demo.Model.Comments;

public interface CommentService {
	public String addComment(Comments comment)throws CommentException;
	public String updateComment(Comments comment)throws CommentException;
	public String deleteComment(Comments comment)throws CommentException;

}
