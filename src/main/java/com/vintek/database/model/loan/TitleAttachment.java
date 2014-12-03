package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TitleAttachments database table.
 * 
 */
@Entity
@Table(name="TitleAttachments")
public class TitleAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="AttachmentID")
	private int attachmentID;

	//bi-directional many-to-one association to Title
	@ManyToOne
	@JoinColumn(name="TitleID")
	private Title title;

	public TitleAttachment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAttachmentID() {
		return this.attachmentID;
	}

	public void setAttachmentID(int attachmentID) {
		this.attachmentID = attachmentID;
	}

	public Title getTitle() {
		return this.title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

}