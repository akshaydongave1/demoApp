package com.demo.project.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="DEMO_PRODUCTS")
@Entity
@Data
@NoArgsConstructor
public class Product {

	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "QUANTITY")
	private BigDecimal quantity;

	@Column(name = "SIZE")
	private String size;

	@Column(name = "PURCHASE_PRICE")
	private String purchaseAmount;

	@Column(name = "SELL_PRICE")
	private BigDecimal sellAmount;

}
