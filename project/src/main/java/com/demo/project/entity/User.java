package com.demo.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="DEMO_USERS")
@Entity
@Data
@NoArgsConstructor
public class User {

	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	@NotBlank(message = "Name is mandatory")
	@Column(name = "USER_NAME")
	private String name;

	@NotBlank(message = "Email is mandatory")
	@Column(name = "USER_EMAIL")
	private String email;

	@NotBlank(message = "Email is mandatory")
	@Column(name = "USER_PASSWORD")
	private String password;

	@Column(name = "USER_CONTACTNO")
	private String contactNo;

}
