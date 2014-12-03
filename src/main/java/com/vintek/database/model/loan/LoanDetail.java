package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the LoanDetail database table.
 * 
 */
@Entity
public class LoanDetail implements Serializable {
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

	@Column(name="CheckDigitOnly")
	private boolean checkDigitOnly;

	@Column(name="CollateralEntryDate")
	private Timestamp collateralEntryDate;

	@Column(name="CollateralID")
	private int collateralID;

	@Column(name="CollateralStartDate")
	private Timestamp collateralStartDate;

	@Column(name="CollateralType")
	private int collateralType;

	@Column(name="CollateralVINErrorID")
	private int collateralVINErrorID;

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

	@Column(name="LIENHOLDER")
	private boolean lienholder;

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

	@Column(name="MatchDate")
	private Timestamp matchDate;

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

	@Column(name="PerfectedDate")
	private Timestamp perfectedDate;

	@Column(name="ReverseVIN")
	private String reverseVIN;

	@Column(name="StatusCodeChangeDate")
	private Timestamp statusCodeChangeDate;

	@Column(name="StatusCodeChangeUser")
	private String statusCodeChangeUser;

	@Column(name="TitleID")
	private int titleID;

	@Column(name="VIN")
	private String vin;

	private String VINError;

	@Column(name="Year")
	private String year;

	public LoanDetail() {
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

	public boolean getCheckDigitOnly() {
		return this.checkDigitOnly;
	}

	public void setCheckDigitOnly(boolean checkDigitOnly) {
		this.checkDigitOnly = checkDigitOnly;
	}

	public Timestamp getCollateralEntryDate() {
		return this.collateralEntryDate;
	}

	public void setCollateralEntryDate(Timestamp collateralEntryDate) {
		this.collateralEntryDate = collateralEntryDate;
	}

	public int getCollateralID() {
		return this.collateralID;
	}

	public void setCollateralID(int collateralID) {
		this.collateralID = collateralID;
	}

	public Timestamp getCollateralStartDate() {
		return this.collateralStartDate;
	}

	public void setCollateralStartDate(Timestamp collateralStartDate) {
		this.collateralStartDate = collateralStartDate;
	}

	public int getCollateralType() {
		return this.collateralType;
	}

	public void setCollateralType(int collateralType) {
		this.collateralType = collateralType;
	}

	public int getCollateralVINErrorID() {
		return this.collateralVINErrorID;
	}

	public void setCollateralVINErrorID(int collateralVINErrorID) {
		this.collateralVINErrorID = collateralVINErrorID;
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

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getLienholder() {
		return this.lienholder;
	}

	public void setLienholder(boolean lienholder) {
		this.lienholder = lienholder;
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

	public Timestamp getMatchDate() {
		return this.matchDate;
	}

	public void setMatchDate(Timestamp matchDate) {
		this.matchDate = matchDate;
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

	public int getTitleID() {
		return this.titleID;
	}

	public void setTitleID(int titleID) {
		this.titleID = titleID;
	}

	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getVINError() {
		return this.VINError;
	}

	public void setVINError(String VINError) {
		this.VINError = VINError;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}