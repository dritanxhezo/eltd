package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LoanAddress database table.
 * 
 */
@Entity
public class LoanAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="Address1")
	private String address1;

	@Column(name="Address2")
	private String address2;

	@Column(name="AddressLocation")
	private short addressLocation;

	@Column(name="City")
	private String city;

	@Column(name="Name")
	private String name;

	@Column(name="Phone")
	private String phone;

	@Column(name="State")
	private String state;

	@Column(name="Tracking")
	private String tracking;

	@Column(name="Type")
	private short type;

	@Column(name="Zip")
	private String zip;

	//bi-directional many-to-one association to Loan
	@ManyToOne
	@JoinColumn(name="LoanID")
	private Loan loan;

	public LoanAddress() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public short getAddressLocation() {
		return this.addressLocation;
	}

	public void setAddressLocation(short addressLocation) {
		this.addressLocation = addressLocation;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTracking() {
		return this.tracking;
	}

	public void setTracking(String tracking) {
		this.tracking = tracking;
	}

	public short getType() {
		return this.type;
	}

	public void setType(short type) {
		this.type = type;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

}