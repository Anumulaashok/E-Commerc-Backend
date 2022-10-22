package com.example.demo.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class LoginDTO {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String uuid;
	 
	private LocalDate locatdate;
	
	private String email;
	
	private String password;

	public LoginDTO(LocalDate locatdate, String email, String password) {
		super();
		this.locatdate = locatdate;
		this.email = email;
		this.password = password;
	}
	
	
}
