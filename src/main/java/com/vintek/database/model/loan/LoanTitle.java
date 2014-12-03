package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the LoanTitle database table.
 * 
 */
@Entity
public class LoanTitle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="HasMatchFlag")
	private boolean hasMatchFlag;

	@Column(name="LIENHOLDER")
	private boolean lienholder;

	@Column(name="MAKE")
	private boolean make;

	@Column(name="MatchDate")
	private Timestamp matchDate;

	@Column(name="MatchOrgID")
	private int matchOrgID;

	@Column(name="MATCHVIN")
	private boolean matchvin;

	@Column(name="MILEAGE")
	private boolean mileage;

	@Column(name="MODEL")
	private boolean model;

	@Column(name="OWNER2")
	private boolean owner2;

	@Column(name="OWNER3")
	private boolean owner3;

	@Column(name="OWNER4")
	private boolean owner4;

	@Column(name="OWNERADDRESS1")
	private boolean owneraddress1;

	@Column(name="OWNERADDRESS2")
	private boolean owneraddress2;

	@Column(name="OWNERCITY")
	private boolean ownercity;

	@Column(name="OWNERSTATE")
	private boolean ownerstate;

	@Column(name="OWNERZIP")
	private boolean ownerzip;

	@Column(name="PRIMARY_OWNER")
	private boolean primaryOwner;

	@Column(name="[YEAR]")
	private boolean year;

	//bi-directional many-to-one association to LoanCollateral
	@ManyToOne
	@JoinColumn(name="CollateralID")
	private LoanCollateral loanCollateral;

	//bi-directional many-to-one association to Title
	@ManyToOne
	@JoinColumn(name="TitleID")
	private Title title;

	public LoanTitle() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getHasMatchFlag() {
		return this.hasMatchFlag;
	}

	public void setHasMatchFlag(boolean hasMatchFlag) {
		this.hasMatchFlag = hasMatchFlag;
	}

	public boolean getLienholder() {
		return this.lienholder;
	}

	public void setLienholder(boolean lienholder) {
		this.lienholder = lienholder;
	}

	public boolean getMake() {
		return this.make;
	}

	public void setMake(boolean make) {
		this.make = make;
	}

	public Timestamp getMatchDate() {
		return this.matchDate;
	}

	public void setMatchDate(Timestamp matchDate) {
		this.matchDate = matchDate;
	}

	public int getMatchOrgID() {
		return this.matchOrgID;
	}

	public void setMatchOrgID(int matchOrgID) {
		this.matchOrgID = matchOrgID;
	}

	public boolean getMatchvin() {
		return this.matchvin;
	}

	public void setMatchvin(boolean matchvin) {
		this.matchvin = matchvin;
	}

	public boolean getMileage() {
		return this.mileage;
	}

	public void setMileage(boolean mileage) {
		this.mileage = mileage;
	}

	public boolean getModel() {
		return this.model;
	}

	public void setModel(boolean model) {
		this.model = model;
	}

	public boolean getOwner2() {
		return this.owner2;
	}

	public void setOwner2(boolean owner2) {
		this.owner2 = owner2;
	}

	public boolean getOwner3() {
		return this.owner3;
	}

	public void setOwner3(boolean owner3) {
		this.owner3 = owner3;
	}

	public boolean getOwner4() {
		return this.owner4;
	}

	public void setOwner4(boolean owner4) {
		this.owner4 = owner4;
	}

	public boolean getOwneraddress1() {
		return this.owneraddress1;
	}

	public void setOwneraddress1(boolean owneraddress1) {
		this.owneraddress1 = owneraddress1;
	}

	public boolean getOwneraddress2() {
		return this.owneraddress2;
	}

	public void setOwneraddress2(boolean owneraddress2) {
		this.owneraddress2 = owneraddress2;
	}

	public boolean getOwnercity() {
		return this.ownercity;
	}

	public void setOwnercity(boolean ownercity) {
		this.ownercity = ownercity;
	}

	public boolean getOwnerstate() {
		return this.ownerstate;
	}

	public void setOwnerstate(boolean ownerstate) {
		this.ownerstate = ownerstate;
	}

	public boolean getOwnerzip() {
		return this.ownerzip;
	}

	public void setOwnerzip(boolean ownerzip) {
		this.ownerzip = ownerzip;
	}

	public boolean getPrimaryOwner() {
		return this.primaryOwner;
	}

	public void setPrimaryOwner(boolean primaryOwner) {
		this.primaryOwner = primaryOwner;
	}

	public boolean getYear() {
		return this.year;
	}

	public void setYear(boolean year) {
		this.year = year;
	}

	public LoanCollateral getLoanCollateral() {
		return this.loanCollateral;
	}

	public void setLoanCollateral(LoanCollateral loanCollateral) {
		this.loanCollateral = loanCollateral;
	}

	public Title getTitle() {
		return this.title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

}