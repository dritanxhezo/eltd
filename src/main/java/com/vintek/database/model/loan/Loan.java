package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the Loan database table.
 * 
 */
@Entity
public class Loan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="ApplicationID")
	private String applicationID;

	@Column(name="ChangeDate")
	private Timestamp changeDate;

	@Column(name="ChangeUser")
	private String changeUser;

	@Column(name="CoOwnerName1")
	private String coOwnerName1;

	@Column(name="CoOwnerName2")
	private String coOwnerName2;

	@Column(name="CoOwnerName3")
	private String coOwnerName3;

	@Column(name="DealerID")
	private String dealerID;

	@Column(name="EntryDate")
	private Time entryDate;

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

	@Column(name="LoanType")
	private short loanType;

	@Column(name="MediaType")
	private short mediaType;

	@Column(name="OrganizationID")
	private int organizationID;

	@Column(name="OwnerAddress1")
	private String ownerAddress1;

	@Column(name="OwnerAddress2")
	private String ownerAddress2;

	@Column(name="OwnerCity")
	private String ownerCity;

	@Column(name="OwnerName")
	private String ownerName;

	@Column(name="OwnerPhone")
	private String ownerPhone;

	@Column(name="OwnerPhone2")
	private String ownerPhone2;

	@Column(name="OwnerPhone2Type")
	private short ownerPhone2Type;

	@Column(name="OwnerPhoneType")
	private short ownerPhoneType;

	@Column(name="OwnerState")
	private String ownerState;

	@Column(name="OwnerType")
	private short ownerType;

	@Column(name="OwnerZip")
	private String ownerZip;

	//bi-directional many-to-one association to CustomFieldValue
	@OneToMany(mappedBy="loan")
	private List<CustomFieldValue> customFieldValues;

	//bi-directional many-to-one association to LoanAddress
	@OneToMany(mappedBy="loan")
	private List<LoanAddress> loanAddresses;

	//bi-directional many-to-one association to LoanAttachment
	@OneToMany(mappedBy="loan")
	private List<LoanAttachment> loanAttachments;

	//bi-directional many-to-one association to LoanCollateral
	@OneToMany(mappedBy="loan")
	private List<LoanCollateral> loanCollaterals;

	//bi-directional many-to-one association to LoanHistory
	@OneToMany(mappedBy="loan")
	private List<LoanHistory> loanHistory;

	public Loan() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApplicationID() {
		return this.applicationID;
	}

	public void setApplicationID(String applicationID) {
		this.applicationID = applicationID;
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

	public Time getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Time entryDate) {
		this.entryDate = entryDate;
	}

	public String getEntryUser() {
		return this.entryUser;
	}

	public void setEntryUser(String entryUser) {
		this.entryUser = entryUser;
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

	public short getLoanType() {
		return this.loanType;
	}

	public void setLoanType(short loanType) {
		this.loanType = loanType;
	}

	public short getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(short mediaType) {
		this.mediaType = mediaType;
	}

	public int getOrganizationID() {
		return this.organizationID;
	}

	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
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

	public String getOwnerPhone() {
		return this.ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	public String getOwnerPhone2() {
		return this.ownerPhone2;
	}

	public void setOwnerPhone2(String ownerPhone2) {
		this.ownerPhone2 = ownerPhone2;
	}

	public short getOwnerPhone2Type() {
		return this.ownerPhone2Type;
	}

	public void setOwnerPhone2Type(short ownerPhone2Type) {
		this.ownerPhone2Type = ownerPhone2Type;
	}

	public short getOwnerPhoneType() {
		return this.ownerPhoneType;
	}

	public void setOwnerPhoneType(short ownerPhoneType) {
		this.ownerPhoneType = ownerPhoneType;
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

	public List<CustomFieldValue> getCustomFieldValues() {
		return this.customFieldValues;
	}

	public void setCustomFieldValues(List<CustomFieldValue> customFieldValues) {
		this.customFieldValues = customFieldValues;
	}

	public CustomFieldValue addCustomFieldValue(CustomFieldValue customFieldValue) {
		getCustomFieldValues().add(customFieldValue);
		customFieldValue.setLoan(this);

		return customFieldValue;
	}

	public CustomFieldValue removeCustomFieldValue(CustomFieldValue customFieldValue) {
		getCustomFieldValues().remove(customFieldValue);
		customFieldValue.setLoan(null);

		return customFieldValue;
	}

	public List<LoanAddress> getLoanAddresses() {
		return this.loanAddresses;
	}

	public void setLoanAddresses(List<LoanAddress> loanAddresses) {
		this.loanAddresses = loanAddresses;
	}

	public LoanAddress addLoanAddress(LoanAddress loanAddress) {
		getLoanAddresses().add(loanAddress);
		loanAddress.setLoan(this);

		return loanAddress;
	}

	public LoanAddress removeLoanAddress(LoanAddress loanAddress) {
		getLoanAddresses().remove(loanAddress);
		loanAddress.setLoan(null);

		return loanAddress;
	}

	public List<LoanAttachment> getLoanAttachments() {
		return this.loanAttachments;
	}

	public void setLoanAttachments(List<LoanAttachment> loanAttachments) {
		this.loanAttachments = loanAttachments;
	}

	public LoanAttachment addLoanAttachment(LoanAttachment loanAttachment) {
		getLoanAttachments().add(loanAttachment);
		loanAttachment.setLoan(this);

		return loanAttachment;
	}

	public LoanAttachment removeLoanAttachment(LoanAttachment loanAttachment) {
		getLoanAttachments().remove(loanAttachment);
		loanAttachment.setLoan(null);

		return loanAttachment;
	}

	public List<LoanCollateral> getLoanCollaterals() {
		return this.loanCollaterals;
	}

	public void setLoanCollaterals(List<LoanCollateral> loanCollaterals) {
		this.loanCollaterals = loanCollaterals;
	}

	public LoanCollateral addLoanCollateral(LoanCollateral loanCollateral) {
		getLoanCollaterals().add(loanCollateral);
		loanCollateral.setLoan(this);

		return loanCollateral;
	}

	public LoanCollateral removeLoanCollateral(LoanCollateral loanCollateral) {
		getLoanCollaterals().remove(loanCollateral);
		loanCollateral.setLoan(null);

		return loanCollateral;
	}

	public List<LoanHistory> getLoanHistory() {
		return this.loanHistory;
	}

	public void setLoanHistory(List<LoanHistory> loanHistory) {
		this.loanHistory = loanHistory;
	}

	public LoanHistory addLoanHistory(LoanHistory loanHistory) {
		getLoanHistory().add(loanHistory);
		loanHistory.setLoan(this);

		return loanHistory;
	}

	public LoanHistory removeLoanHistory(LoanHistory loanHistory) {
		getLoanHistory().remove(loanHistory);
		loanHistory.setLoan(null);

		return loanHistory;
	}

}