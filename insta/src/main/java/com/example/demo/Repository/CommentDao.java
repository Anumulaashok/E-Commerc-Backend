package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Comments;

@Repository
public interface CommentDao extends JpaRepository<Comments, Integer>{

	
}
