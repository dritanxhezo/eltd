package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the QuickLoanSearch database table.
 * 
 */
@Entity
public class QuickLoanSearch implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	private int id;

	@Column(name="ApplicationID")
	private String applicationID;

	@Column(name="Archive")
	private boolean archive;

	@Column(name="ChangeDate")
	private Timestamp changeDate;

	@Column(name="ChangeUser")
	private String changeUser;

	@Column(name="CollateralID")
	private int collateralID;

	@Column(name="CollateralType")
	private int collateralType;

	@Column(name="CoOwnerName1")
	private String coOwnerName1;

	@Column(name="CoOwnerName2")
	private String coOwnerName2;

	@Column(name="CoOwnerName3")
	private String coOwnerName3;

	@Column(name="DealerID")
	private String dealerID;

	@Column(name="EntryDate")
	private Timestamp entryDate;

	@Column(name="EntryUser")
	private String entryUser;

	@Column(name="LoanAmount")
	private BigDecimal loanAmount;

	@Column(name="LoanBalance")
	private BigDecimal loanBalance;

	@Column(name="LoanEnd")
	private Timestamp loanEnd;

	@Column(name="LoanStart")
	private Timestamp loanStart;

	@Column(name="LoanStatus")
	private String loanStatus;

	@Column(name="LoanType")
	private short loanType;

	@Column(name="Make")
	private String make;

	@Column(name="MediaType")
	private short mediaType;

	@Column(name="Mileage")
	private int mileage;

	@Column(name="Model")
	private String model;

	@Column(name="NewOrUsed")
	private short newOrUsed;

	@Column(name="OrganizationID")
	private int organizationID;

	@Column(name="OrgID")
	private String orgID;

	@Column(name="OwnerAddress1")
	private String ownerAddress1;

	@Column(name="OwnerAddress2")
	private String ownerAddress2;

	@Column(name="OwnerCity")
	private String ownerCity;

	@Column(name="OwnerName")
	private String ownerName;

	@Column(name="OwnerState")
	private String ownerState;

	@Column(name="OwnerType")
	private short ownerType;

	@Column(name="OwnerZip")
	private String ownerZip;

	@Column(name="PaperTitleDataPending")
	private boolean paperTitleDataPending;

	@Column(name="VIN")
	private String vin;

	@Column(name="Year")
	private String year;

	public QuickLoanSearch() {
	}

	public String getApplicationID() {
		return this.applicationID;
	}

	public void setApplicationID(String applicationID) {
		this.applicationID = applicationID;
	}

	public boolean getArchive() {
		return this.archive;
	}

	public void setArchive(boolean archive) {
		this.archive = archive;
	}

	public Timestamp getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Timestamp changeDate) {
		this.changeDate = changeDate;
	}

	public String getChangeUser() {
		return this.changeUser;
	}

	public void setChangeUser(String changeUser) {
		this.changeUser = changeUser;
	}

	public int getCollateralID() {
		return this.collateralID;
	}

	public void setCollateralID(int collateralID) {
		this.collateralID = collateralID;
	}

	public int getCollateralType() {
		return this.collateralType;
	}

	public void setCollateralType(int collateralType) {
		this.collateralType = collateralType;
	}

	public String getCoOwnerName1() {
		return this.coOwnerName1;
	}

	public void setCoOwnerName1(String coOwnerName1) {
		this.coOwnerName1 = coOwnerName1;
	}

	public String getCoOwnerName2() {
		return this.coOwnerName2;
	}

	public void setCoOwnerName2(String coOwnerName2) {
		this.coOwnerName2 = coOwnerName2;
	}

	public String getCoOwnerName3() {
		return this.coOwnerName3;
	}

	public void setCoOwnerName3(String coOwnerName3) {
		this.coOwnerName3 = coOwnerName3;
	}

	public String getDealerID() {
		return this.dealerID;
	}

	public void setDealerID(String dealerID) {
		this.dealerID = dealerID;
	}

	public Timestamp getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Timestamp entryDate) {
		this.entryDate = entryDate;
	}

	public String getEntryUser() {
		return this.entryUser;
	}

	public void setEntryUser(String entryUser) {
		this.entryUser = entryUser;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public BigDecimal getLoanBalance() {
		return this.loanBalance;
	}

	public void setLoanBalance(BigDecimal loanBalance) {
		this.loanBalance = loanBalance;
	}

	public Timestamp getLoanEnd() {
		return this.loanEnd;
	}

	public void setLoanEnd(Timestamp loanEnd) {
		this.loanEnd = loanEnd;
	}

	public Timestamp getLoanStart() {
		return this.loanStart;
	}

	public void setLoanStart(Timestamp loanStart) {
		this.loanStart = loanStart;
	}

	public String getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public short getLoanType() {
		return this.loanType;
	}

	public void setLoanType(short loanType) {
		this.loanType = loanType;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public short getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(short mediaType) {
		this.mediaType = mediaType;
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

	public int getOrganizationID() {
		return this.organizationID;
	}

	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}

	public String getOrgID() {
		return this.orgID;
	}

	public void setOrgID(String orgID) {
		this.orgID = orgID;
	}

	public String getOwnerAddress1() {
		return this.ownerAddress1;
	}

	public void setOwnerAddress1(String ownerAddress1) {
		this.ownerAddress1 = ownerAddress1;
	}

	public String getOwnerAddress2() {
		return this.ownerAddress2;
	}

	public void setOwnerAddress2(String ownerAddress2) {
		this.ownerAddress2 = ownerAddress2;
	}

	public String getOwnerCity() {
		return this.ownerCity;
	}

	public void setOwnerCity(String ownerCity) {
		this.ownerCity = ownerCity;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerState() {
		return this.ownerState;
	}

	public void setOwnerState(String ownerState) {
		this.ownerState = ownerState;
	}

	public short getOwnerType() {
		return this.ownerType;
	}

	public void setOwnerType(short ownerType) {
		this.ownerType = ownerType;
	}

	public String getOwnerZip() {
		return this.ownerZip;
	}

	public void setOwnerZip(String ownerZip) {
		this.ownerZip = ownerZip;
	}

	public boolean getPaperTitleDataPending() {
		return this.paperTitleDataPending;
	}

	public void setPaperTitleDataPending(boolean paperTitleDataPending) {
		this.paperTitleDataPending = paperTitleDataPending;
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

}