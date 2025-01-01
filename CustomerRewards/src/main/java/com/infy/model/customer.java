package com.infy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "CustomerDetails")

public class customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CustomerId;
	
	@Column(name ="First_Name")
	private String name;
	
	@Column(name ="Last_Name")
	private String surname;

	public long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

		

}
