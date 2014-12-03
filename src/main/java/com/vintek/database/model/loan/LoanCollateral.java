package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the LoanCollateral database table.
 * 
 */
@Entity
public class LoanCollateral implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="Archive")
	private boolean archive;

	@Column(name="CollateralType")
	private int collateralType;

	@Column(name="EntryDate")
	private Timestamp entryDate;

	@Column(name="LoanStatus")
	private String loanStatus;

	@Column(name="Make")
	private String make;

	@Column(name="Mileage")
	private int mileage;

	@Column(name="Model")
	private String model;

	@Column(name="NewOrUsed")
	private short newOrUsed;

	@Column(name="OrgIDCol")
	private int orgIDCol;

	@Column(name="PaperTitleDataPending")
	private boolean paperTitleDataPending;

	@Column(name="PerfectedDate")
	private Timestamp perfectedDate;

	@Column(name="ReverseVIN")
	private String reverseVIN;

	@Column(name="StartDate")
	private Timestamp startDate;

	@Column(name="StatusCodeChangeDate")
	private Timestamp statusCodeChangeDate;

	@Column(name="StatusCodeChangeUser")
	private String statusCodeChangeUser;

	@Column(name="VIN")
	private String vin;

	@Column(name="Year")
	private String year;

	//bi-directional many-to-one association to Loan
	@ManyToOne
	@JoinColumn(name="LoanID")
	private Loan loan;

	//bi-directional many-to-one association to LoanTitle
	@OneToMany(mappedBy="loanCollateral")
	private List<LoanTitle> loanTitles;

	public LoanCollateral() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getArchive() {
		return this.archive;
	}

	public void setArchive(boolean archive) {
		this.archive = archive;
	}

	public int getCollateralType() {
		return this.collateralType;
	}

	public void setCollateralType(int collateralType) {
		this.collateralType = collateralType;
	}

	public Timestamp getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Timestamp entryDate) {
		this.entryDate = entryDate;
	}

	public String getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getMileage() {
		return this.mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public short getNewOrUsed() {
		return this.newOrUsed;
	}

	public void setNewOrUsed(short newOrUsed) {
		this.newOrUsed = newOrUsed;
	}

	public int getOrgIDCol() {
		return this.orgIDCol;
	}

	public void setOrgIDCol(int orgIDCol) {
		this.orgIDCol = orgIDCol;
	}

	public boolean getPaperTitleDataPending() {
		return this.paperTitleDataPending;
	}

	public void setPaperTitleDataPending(boolean paperTitleDataPending) {
		this.paperTitleDataPending = paperTitleDataPending;
	}

	public Timestamp getPerfectedDate() {
		return this.perfectedDate;
	}

	public void setPerfectedDate(Timestamp perfectedDate) {
		this.perfectedDate = perfectedDate;
	}

	public String getReverseVIN() {
		return this.reverseVIN;
	}

	public void setReverseVIN(String reverseVIN) {
		this.reverseVIN = reverseVIN;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getStatusCodeChangeDate() {
		return this.statusCodeChangeDate;
	}

	public void setStatusCodeChangeDate(Timestamp statusCodeChangeDate) {
		this.statusCodeChangeDate = statusCodeChangeDate;
	}

	public String getStatusCodeChangeUser() {
		return this.statusCodeChangeUser;
	}

	public void setStatusCodeChangeUser(String statusCodeChangeUser) {
		this.statusCodeChangeUser = statusCodeChangeUser;
	}

	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public List<LoanTitle> getLoanTitles() {
		return this.loanTitles;
	}

	public void setLoanTitles(List<LoanTitle> loanTitles) {
		this.loanTitles = loanTitles;
	}

	public LoanTitle addLoanTitle(LoanTitle loanTitle) {
		getLoanTitles().add(loanTitle);
		loanTitle.setLoanCollateral(this);

		return loanTitle;
	}

	public LoanTitle removeLoanTitle(LoanTitle loanTitle) {
		getLoanTitles().remove(loanTitle);
		loanTitle.setLoanCollateral(null);

		return loanTitle;
	}

}