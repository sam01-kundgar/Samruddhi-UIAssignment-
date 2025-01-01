package com.infy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TransactionDetails")

public class transaction {
	
	@Id
	private long transactionId;
	
	@Column(name="SpentAmount")
	private double amount;
	
	@Column(name="Date")
	private String date;
	
	
	@ManyToOne
    @JoinColumn(name = "CustomerId") 
    private customer customer;


	public long getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public customer getCustomer() {
		return customer;
	}


	public void setCustomer(customer customer) {
		this.customer = customer;
	}
	
	
	

}
