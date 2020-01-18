package com.demo.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="DEMO_CUSTOMERS")
@Entity
@Data
@NoArgsConstructor
public class Customer {

	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	@NotBlank(message = "Name is mandatory")
	@Column(name = "CUSTMR_NAME")
	private String customerName;

	@NotBlank(message = "Email is mandatory")
	@Column(name = "CUSTMR_EMAIL")
	private String customerEmail;

	@Column(name = "CUSTMR_PASSWORD")
	private String customerPassword;

	@NotBlank(message = "Customer Contact Number is mandatory")
	@Column(name = "CUSTMR_CNTCT_NO")
	private String customerContactNumber;

	@Column(name = "MONDAY")
	private Boolean monday;

	@Column(name = "TUESDAY")
	private Boolean tuesday;

	@Column(name = "WEDNESDAY")
	private Boolean wesnesday;

	@Column(name = "THURSDAY")
	private Boolean thursday;

	@Column(name = "FRIDAY")
	private Boolean friday;

	@Column(name = "SATUDAY")
	private Boolean saturday;

	@Column(name = "SUNDAY")
	private Boolean sunday;

	@Column(name = "MONTHLY")
	private Boolean monthly;

}
