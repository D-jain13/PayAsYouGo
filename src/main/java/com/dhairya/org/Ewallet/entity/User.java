package com.dhairya.org.Ewallet.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name="system-uuid",strategy = "uuid")
	@Column(name = "userId",nullable = false,unique = true)
	private String userId;
	
	@Column(name="firstName",nullable = false,length = 25)
	private String firstName;
	
	@Column(name="lastName",nullable = false,length = 25)
	private String lastName;
	
	@Column(name="mobileNumber",nullable = false,unique = true)
	private String mobileNumber;
	
	@Column(name="bankAccountNumber",nullable = false,unique = true)
	private String bankAccountNumber;
	
	@Column(name="password",nullable = false)
	private String password;
	 
	@Column(name="amount",nullable = false)
	private float amount;
	

	public float getAmount() {
		return amount;
	}

	public User(String userId, String firstName, String lastName, String mobileNumber, String bankAccountNumber,
			String password, float amount) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.bankAccountNumber = bankAccountNumber;
		this.password = password;
		this.amount = amount;
	}
	public User() {
		
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", bankAccountNumber=" + bankAccountNumber + ", password=" + password + ", amount="
				+ amount + "]";
	}


	
	
}
