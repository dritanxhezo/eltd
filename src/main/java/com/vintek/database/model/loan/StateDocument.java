package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the StateDocuments database table.
 * 
 */
@Entity
@Table(name="StateDocuments")
public class StateDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="CreatedBy")
	private String createdBy;

	@Column(name="CreationDate")
	private Timestamp creationDate;

	@Column(name="Description")
	private String description;

	@Column(name="Document")
	@Lob
	private byte[] document;

	@Column(name="Filename")
	private String filename;

	@Column(name="OrganizationID")
	private int organizationID;

	@Column(name="State")
	private String state;

	@Column(name="Type")
	private String type;

	private boolean VINtekDoc;

	public StateDocument() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getDocument() {
		return this.document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getOrganizationID() {
		return this.organizationID;
	}

	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getVINtekDoc() {
		return this.VINtekDoc;
	}

	public void setVINtekDoc(boolean VINtekDoc) {
		this.VINtekDoc = VINtekDoc;
	}

}