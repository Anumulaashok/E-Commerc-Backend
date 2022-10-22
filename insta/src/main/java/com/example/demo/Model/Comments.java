 package com.example.demo.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Comments {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer commentId;
	
	private String Username;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Post post;
	
	
}
