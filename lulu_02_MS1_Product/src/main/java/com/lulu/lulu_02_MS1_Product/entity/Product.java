package com.lulu.lulu_02_MS1_Product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sports_product")
public class Product {
	@Id
	int id;
	String name;
	float cost;
	String descp;

	public Product(int id, String name, float cost, String descp) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.descp = descp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getDescp() {
		return descp;
	}

	public void setDescp(String descp) {
		this.descp = descp;
	}

	@Override
	public String toString() {
		return "SportsProduct [id=" + id + ", name=" + name + ", cost=" + cost + ", descp=" + descp + "]";
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
