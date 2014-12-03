package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CustomFieldValues database table.
 * 
 */
@Entity
@Table(name="CustomFieldValues")
public class CustomFieldValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="CustomOrgID")
	private int customOrgID;

	@Column(name="Field1")
	private String field1;

	@Column(name="Field2")
	private String field2;

	@Column(name="Field3")
	private String field3;

	@Column(name="Field4")
	private String field4;

	@Column(name="Field5")
	private String field5;

	@Column(name="Field6")
	private String field6;

	//bi-directional many-to-one association to Loan
	@ManyToOne
	@JoinColumn(name="LoanID")
	private Loan loan;

	public CustomFieldValue() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomOrgID() {
		return this.customOrgID;
	}

	public void setCustomOrgID(int customOrgID) {
		this.customOrgID = customOrgID;
	}

	public String getField1() {
		return this.field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return this.field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return this.field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getField4() {
		return this.field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	public String getField5() {
		return this.field5;
	}

	public void setField5(String field5) {
		this.field5 = field5;
	}

	public String getField6() {
		return this.field6;
	}

	public void setField6(String field6) {
		this.field6 = field6;
	}

	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

}