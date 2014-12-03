package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Collateral database table.
 * 
 */
@Entity
@Table(name="Collateral")
public class CollateralType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="DecodeMakeYear")
	private boolean decodeMakeYear;

	@Column(name="Enabled")
	private boolean enabled;

	@Column(name="IsDefault")
	private boolean isDefault;

	@Column(name="Name")
	private String name;

	@Column(name="OrganizationID")
	private int organizationID;

	private boolean VINDecoder;

	public CollateralType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getDecodeMakeYear() {
		return this.decodeMakeYear;
	}

	public void setDecodeMakeYear(boolean decodeMakeYear) {
		this.decodeMakeYear = decodeMakeYear;
	}

	public boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrganizationID() {
		return this.organizationID;
	}

	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}

	public boolean getVINDecoder() {
		return this.VINDecoder;
	}

	public void setVINDecoder(boolean VINDecoder) {
		this.VINDecoder = VINDecoder;
	}

}