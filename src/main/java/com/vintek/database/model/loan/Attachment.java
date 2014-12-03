package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Attachments database table.
 * 
 */
@Entity
@Table(name="Attachments")
public class Attachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="Archive")
	private boolean archive;

	@Column(name="CanBeSigned")
	private boolean canBeSigned;

	@Column(name="Compressed")
	private boolean compressed;

	@Column(name="ConsumerAccess")
	private boolean consumerAccess;

	@Column(name="CreatedBy")
	private String createdBy;

	@Column(name="CreationDate")
	private Timestamp creationDate;

	@Column(name="Description")
	private String description;

	private boolean ESignature;

	@Column(name="FileID")
	private int fileID;

	@Column(name="Filename")
	private String filename;

	@Column(name="ImageID")
	private String imageID;

	private boolean miscDoc;

	@Column(name="Type")
	private String type;

	@Column(name="VIN")
	private String vin;

	public Attachment() {
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

	public boolean getCanBeSigned() {
		return this.canBeSigned;
	}

	public void setCanBeSigned(boolean canBeSigned) {
		this.canBeSigned = canBeSigned;
	}

	public boolean getCompressed() {
		return this.compressed;
	}

	public void setCompressed(boolean compressed) {
		this.compressed = compressed;
	}

	public boolean getConsumerAccess() {
		return this.consumerAccess;
	}

	public void setConsumerAccess(boolean consumerAccess) {
		this.consumerAccess = consumerAccess;
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

	public boolean getESignature() {
		return this.ESignature;
	}

	public void setESignature(boolean ESignature) {
		this.ESignature = ESignature;
	}

	public int getFileID() {
		return this.fileID;
	}

	public void setFileID(int fileID) {
		this.fileID = fileID;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getImageID() {
		return this.imageID;
	}

	public void setImageID(String imageID) {
		this.imageID = imageID;
	}

	public boolean getMiscDoc() {
		return this.miscDoc;
	}

	public void setMiscDoc(boolean miscDoc) {
		this.miscDoc = miscDoc;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

}