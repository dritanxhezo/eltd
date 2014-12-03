package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TitleHistoryNew database table.
 * 
 */
@Entity
@Table(name="TitleHistoryNew")
public class TitleHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="ChangeDate")
	private Timestamp changeDate;

	@Column(name="ChangeUser")
	private String changeUser;

	private boolean urgent;

	//bi-directional many-to-one association to Note
	@ManyToOne
	@JoinColumn(name="NoteID")
	private Note note;

	//bi-directional many-to-one association to Title
	@ManyToOne
	@JoinColumn(name="TitleID")
	private Title title;

	public TitleHistory() {
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

	public boolean getUrgent() {
		return this.urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	public Note getNote() {
		return this.note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public Title getTitle() {
		return this.title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

}