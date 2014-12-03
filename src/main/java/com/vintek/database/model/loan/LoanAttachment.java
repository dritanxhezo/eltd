package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the LoanAttachments database table.
 * 
 */
@Entity
@Table(name="LoanAttachments")
public class LoanAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="AttachmentID")
	private int attachmentID;

	@Column(name="Compressed")
	private boolean compressed;

	@Column(name="MatchDate")
	private Timestamp matchDate;

	//bi-directional many-to-one association to Loan
	@ManyToOne
	@JoinColumn(name="LoanID")
	private Loan loan;

	public LoanAttachment() {
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

	public boolean getCompressed() {
		return this.compressed;
	}

	public void setCompressed(boolean compressed) {
		this.compressed = compressed;
	}

	public Timestamp getMatchDate() {
		return this.matchDate;
	}

	public void setMatchDate(Timestamp matchDate) {
		this.matchDate = matchDate;
	}

	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

}