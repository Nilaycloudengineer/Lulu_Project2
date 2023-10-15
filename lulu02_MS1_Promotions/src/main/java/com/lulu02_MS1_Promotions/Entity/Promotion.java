package com.lulu02_MS1_Promotions.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "promotion")
public class Promotion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	String month;
	double cost;
	int duration_Day;
	String media_Partner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getDuration_Day() {
		return duration_Day;
	}

	public void setDuration_Day(int duration_Day) {
		this.duration_Day = duration_Day;
	}

	public String getMedia_Partner() {
		return media_Partner;
	}

	public void setMedia_Partner(String media_Partner) {
		this.media_Partner = media_Partner;
	}

}
