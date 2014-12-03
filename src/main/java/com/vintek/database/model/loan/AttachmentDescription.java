package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AttachmentDescription database table.
 * 
 */
@Entity
public class AttachmentDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="Description")
	private String description;

	@Column(name="OrganizationID")
	private int organizationID;

	public AttachmentDescription() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOrganizationID() {
		return this.organizationID;
	}

	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}

}