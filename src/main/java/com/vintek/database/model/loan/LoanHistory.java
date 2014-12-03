package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the LoanHistoryNew database table.
 * 
 */
@Entity
@Table(name="LoanHistoryNew")
public class LoanHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="ChangeDate")
	private Timestamp changeDate;

	@Column(name="ChangeUser")
	private String changeUser;

	@Column(name="NoteID")
	private int noteID;

	private boolean urgent;

	//bi-directional many-to-one association to Loan
	@ManyToOne
	@JoinColumn(name="LoanID")
	private Loan loan;

	public LoanHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getNoteID() {
		return this.noteID;
	}

	public void setNoteID(int noteID) {
		this.noteID = noteID;
	}

	public boolean getUrgent() {
		return this.urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

}