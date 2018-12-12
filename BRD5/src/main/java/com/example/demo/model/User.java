package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerTable")
public class User {


	private Integer customerCode;
	private String customerName;
	private String customerAddress;
	private String customerPincode;
	private String customerEmail;
	private String customerNumber;
	private String registrationDate;
	private String createdBy;
	private String modifiedBy;

	@Id
	@Column(length = 10)
	public Integer getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(Integer customerCode) {
		this.customerCode = customerCode;
	}
	@Column(length = 30)
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Column(length = 100)
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Column(length = 6)
	public String getCustomerPincode() {
		return customerPincode;
	}

	public void setCustomerPincode(String customerPincode) {
		this.customerPincode = customerPincode;
	}
	@Column(length = 100)
	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	@Column(length = 20)
	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	

}
