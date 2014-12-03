package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the Title database table.
 * 
 */
@Entity
public class Title implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="AddressID")
	private int addressID;

	private boolean archive;

	@Column(name="ChangeDate")
	private Timestamp changeDate;

	@Column(name="CollateralType")
	private short collateralType;

	@Column(name="DocType")
	private String docType;

	@Column(name="EntryDate")
	private Time entryDate;

	@Column(name="EntryUser")
	private String entryUser;

	@Column(name="ImageID")
	private String imageID;

	@Column(name="ImagePath")
	private String imagePath;

	@Column(name="IssueDate")
	private Timestamp issueDate;

	@Column(name="Lessee")
	private String lessee;

	@Column(name="LienDate")
	private Timestamp lienDate;

	@Column(name="LienExpirationDate")
	private Timestamp lienExpirationDate;

	@Column(name="LienHolder")
	private String lienHolder;

	@Column(name="LienPriorityCode")
	private short lienPriorityCode;

	@Column(name="Make")
	private String make;

	@Column(name="MediaType")
	private short mediaType;

	@Column(name="Mileage")
	private int mileage;

	@Column(name="Model")
	private String model;

	@Column(name="NumberOfLiens")
	private short numberOfLiens;

	@Column(name="OrganizationID")
	private int organizationID;

	@Column(name="Original")
	private boolean original;

	@Column(name="Owner2Designation")
	private String owner2Designation;

	@Column(name="Owner2Relationship")
	private String owner2Relationship;

	@Column(name="Owner3Relationship")
	private String owner3Relationship;

	@Column(name="Owner4Relationship")
	private String owner4Relationship;

	@Column(name="OwnerAddress1")
	private String ownerAddress1;

	@Column(name="OwnerAddress2")
	private String ownerAddress2;

	@Column(name="OwnerCity")
	private String ownerCity;

	@Column(name="OwnerDesignation")
	private String ownerDesignation;

	@Column(name="OwnerName")
	private String ownerName;

	@Column(name="OwnerName2")
	private String ownerName2;

	@Column(name="OwnerName3")
	private String ownerName3;

	@Column(name="OwnerName4")
	private String ownerName4;

	@Column(name="OwnerName5")
	private String ownerName5;

	@Column(name="OwnerState")
	private String ownerState;

	@Column(name="OwnerZip")
	private String ownerZip;

	@Column(name="PaperStorage")
	private boolean paperStorage;

	@Column(name="PrintDate")
	private Time printDate;

	@Column(name="ReceiveDate")
	private Timestamp receiveDate;

	@Column(name="Rejected")
	private boolean rejected;

	@Column(name="ReleaseDate")
	private Timestamp releaseDate;

	@Column(name="TagNo")
	private String tagNo;

	@Column(name="TitleControlNumber")
	private String titleControlNumber;

	@Column(name="TitleNumber")
	private String titleNumber;

	@Column(name="TitleState")
	private String titleState;

	@Column(name="TitleStatus")
	private String titleStatus;

	@Column(name="TitleStatusCodeChangeDate")
	private Timestamp titleStatusCodeChangeDate;

	@Column(name="TitleStatusCodeChangeUser")
	private String titleStatusCodeChangeUser;

	@Column(name="VIN")
	private String vin;

	private boolean XTFlag;

	@Column(name="Year")
	private String year;

	//bi-directional many-to-one association to LoanTitle
	@OneToMany(mappedBy="title")
	private List<LoanTitle> loanTitles;

	//bi-directional one-to-one association to Title
	@OneToOne
	@JoinColumn(name="ID")
	private Title title1;

	//bi-directional one-to-one association to Title
	@OneToOne(mappedBy="title1")
	private Title title2;

	//bi-directional many-to-one association to TitleAttachment
	@OneToMany(mappedBy="title")
	private List<TitleAttachment> titleAttachments;

	//bi-directional many-to-one association to TitleBrand
	@OneToMany(mappedBy="title")
	private List<TitleBrand> titleBrands;

	//bi-directional many-to-one association to TitleHistory
	@OneToMany(mappedBy="title")
	private List<TitleHistory> titleHistoryNews;

	public Title() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAddressID() {
		return this.addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
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

	public short getCollateralType() {
		return this.collateralType;
	}

	public void setCollateralType(short collateralType) {
		this.collateralType = collateralType;
	}

	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
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

	public String getImageID() {
		return this.imageID;
	}

	public void setImageID(String imageID) {
		this.imageID = imageID;
	}

	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Timestamp getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Timestamp issueDate) {
		this.issueDate = issueDate;
	}

	public String getLessee() {
		return this.lessee;
	}

	public void setLessee(String lessee) {
		this.lessee = lessee;
	}

	public Timestamp getLienDate() {
		return this.lienDate;
	}

	public void setLienDate(Timestamp lienDate) {
		this.lienDate = lienDate;
	}

	public Timestamp getLienExpirationDate() {
		return this.lienExpirationDate;
	}

	public void setLienExpirationDate(Timestamp lienExpirationDate) {
		this.lienExpirationDate = lienExpirationDate;
	}

	public String getLienHolder() {
		return this.lienHolder;
	}

	public void setLienHolder(String lienHolder) {
		this.lienHolder = lienHolder;
	}

	public short getLienPriorityCode() {
		return this.lienPriorityCode;
	}

	public void setLienPriorityCode(short lienPriorityCode) {
		this.lienPriorityCode = lienPriorityCode;
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

	public short getNumberOfLiens() {
		return this.numberOfLiens;
	}

	public void setNumberOfLiens(short numberOfLiens) {
		this.numberOfLiens = numberOfLiens;
	}

	public int getOrganizationID() {
		return this.organizationID;
	}

	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}

	public boolean getOriginal() {
		return this.original;
	}

	public void setOriginal(boolean original) {
		this.original = original;
	}

	public String getOwner2Designation() {
		return this.owner2Designation;
	}

	public void setOwner2Designation(String owner2Designation) {
		this.owner2Designation = owner2Designation;
	}

	public String getOwner2Relationship() {
		return this.owner2Relationship;
	}

	public void setOwner2Relationship(String owner2Relationship) {
		this.owner2Relationship = owner2Relationship;
	}

	public String getOwner3Relationship() {
		return this.owner3Relationship;
	}

	public void setOwner3Relationship(String owner3Relationship) {
		this.owner3Relationship = owner3Relationship;
	}

	public String getOwner4Relationship() {
		return this.owner4Relationship;
	}

	public void setOwner4Relationship(String owner4Relationship) {
		this.owner4Relationship = owner4Relationship;
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

	public String getOwnerDesignation() {
		return this.ownerDesignation;
	}

	public void setOwnerDesignation(String ownerDesignation) {
		this.ownerDesignation = ownerDesignation;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerName2() {
		return this.ownerName2;
	}

	public void setOwnerName2(String ownerName2) {
		this.ownerName2 = ownerName2;
	}

	public String getOwnerName3() {
		return this.ownerName3;
	}

	public void setOwnerName3(String ownerName3) {
		this.ownerName3 = ownerName3;
	}

	public String getOwnerName4() {
		return this.ownerName4;
	}

	public void setOwnerName4(String ownerName4) {
		this.ownerName4 = ownerName4;
	}

	public String getOwnerName5() {
		return this.ownerName5;
	}

	public void setOwnerName5(String ownerName5) {
		this.ownerName5 = ownerName5;
	}

	public String getOwnerState() {
		return this.ownerState;
	}

	public void setOwnerState(String ownerState) {
		this.ownerState = ownerState;
	}

	public String getOwnerZip() {
		return this.ownerZip;
	}

	public void setOwnerZip(String ownerZip) {
		this.ownerZip = ownerZip;
	}

	public boolean getPaperStorage() {
		return this.paperStorage;
	}

	public void setPaperStorage(boolean paperStorage) {
		this.paperStorage = paperStorage;
	}

	public Time getPrintDate() {
		return this.printDate;
	}

	public void setPrintDate(Time printDate) {
		this.printDate = printDate;
	}

	public Timestamp getReceiveDate() {
		return this.receiveDate;
	}

	public void setReceiveDate(Timestamp receiveDate) {
		this.receiveDate = receiveDate;
	}

	public boolean getRejected() {
		return this.rejected;
	}

	public void setRejected(boolean rejected) {
		this.rejected = rejected;
	}

	public Timestamp getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Timestamp releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getTagNo() {
		return this.tagNo;
	}

	public void setTagNo(String tagNo) {
		this.tagNo = tagNo;
	}

	public String getTitleControlNumber() {
		return this.titleControlNumber;
	}

	public void setTitleControlNumber(String titleControlNumber) {
		this.titleControlNumber = titleControlNumber;
	}

	public String getTitleNumber() {
		return this.titleNumber;
	}

	public void setTitleNumber(String titleNumber) {
		this.titleNumber = titleNumber;
	}

	public String getTitleState() {
		return this.titleState;
	}

	public void setTitleState(String titleState) {
		this.titleState = titleState;
	}

	public String getTitleStatus() {
		return this.titleStatus;
	}

	public void setTitleStatus(String titleStatus) {
		this.titleStatus = titleStatus;
	}

	public Timestamp getTitleStatusCodeChangeDate() {
		return this.titleStatusCodeChangeDate;
	}

	public void setTitleStatusCodeChangeDate(Timestamp titleStatusCodeChangeDate) {
		this.titleStatusCodeChangeDate = titleStatusCodeChangeDate;
	}

	public String getTitleStatusCodeChangeUser() {
		return this.titleStatusCodeChangeUser;
	}

	public void setTitleStatusCodeChangeUser(String titleStatusCodeChangeUser) {
		this.titleStatusCodeChangeUser = titleStatusCodeChangeUser;
	}

	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public boolean getXTFlag() {
		return this.XTFlag;
	}

	public void setXTFlag(boolean XTFlag) {
		this.XTFlag = XTFlag;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public List<LoanTitle> getLoanTitles() {
		return this.loanTitles;
	}

	public void setLoanTitles(List<LoanTitle> loanTitles) {
		this.loanTitles = loanTitles;
	}

	public LoanTitle addLoanTitle(LoanTitle loanTitle) {
		getLoanTitles().add(loanTitle);
		loanTitle.setTitle(this);

		return loanTitle;
	}

	public LoanTitle removeLoanTitle(LoanTitle loanTitle) {
		getLoanTitles().remove(loanTitle);
		loanTitle.setTitle(null);

		return loanTitle;
	}

	public Title getTitle1() {
		return this.title1;
	}

	public void setTitle1(Title title1) {
		this.title1 = title1;
	}

	public Title getTitle2() {
		return this.title2;
	}

	public void setTitle2(Title title2) {
		this.title2 = title2;
	}

	public List<TitleAttachment> getTitleAttachments() {
		return this.titleAttachments;
	}

	public void setTitleAttachments(List<TitleAttachment> titleAttachments) {
		this.titleAttachments = titleAttachments;
	}

	public TitleAttachment addTitleAttachment(TitleAttachment titleAttachment) {
		getTitleAttachments().add(titleAttachment);
		titleAttachment.setTitle(this);

		return titleAttachment;
	}

	public TitleAttachment removeTitleAttachment(TitleAttachment titleAttachment) {
		getTitleAttachments().remove(titleAttachment);
		titleAttachment.setTitle(null);

		return titleAttachment;
	}

	public List<TitleBrand> getTitleBrands() {
		return this.titleBrands;
	}

	public void setTitleBrands(List<TitleBrand> titleBrands) {
		this.titleBrands = titleBrands;
	}

	public TitleBrand addTitleBrand(TitleBrand titleBrand) {
		getTitleBrands().add(titleBrand);
		titleBrand.setTitle(this);

		return titleBrand;
	}

	public TitleBrand removeTitleBrand(TitleBrand titleBrand) {
		getTitleBrands().remove(titleBrand);
		titleBrand.setTitle(null);

		return titleBrand;
	}

	public List<TitleHistory> getTitleHistoryNews() {
		return this.titleHistoryNews;
	}

	public void setTitleHistoryNews(List<TitleHistory> titleHistoryNews) {
		this.titleHistoryNews = titleHistoryNews;
	}

	public TitleHistory addTitleHistoryNew(TitleHistory titleHistoryNew) {
		getTitleHistoryNews().add(titleHistoryNew);
		titleHistoryNew.setTitle(this);

		return titleHistoryNew;
	}

	public TitleHistory removeTitleHistoryNew(TitleHistory titleHistoryNew) {
		getTitleHistoryNews().remove(titleHistoryNew);
		titleHistoryNew.setTitle(null);

		return titleHistoryNew;
	}

}