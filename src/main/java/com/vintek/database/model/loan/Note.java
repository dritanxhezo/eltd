package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Note database table.
 * 
 */
@Entity
public class Note implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="Note")
	private String note;

	//bi-directional many-to-one association to TitleHistory
	@OneToMany(mappedBy="note")
	private List<TitleHistory> titleHistoryNews;

	public Note() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<TitleHistory> getTitleHistoryNews() {
		return this.titleHistoryNews;
	}

	public void setTitleHistoryNews(List<TitleHistory> titleHistoryNews) {
		this.titleHistoryNews = titleHistoryNews;
	}

	public TitleHistory addTitleHistoryNew(TitleHistory titleHistoryNew) {
		getTitleHistoryNews().add(titleHistoryNew);
		titleHistoryNew.setNote(this);

		return titleHistoryNew;
	}

	public TitleHistory removeTitleHistoryNew(TitleHistory titleHistoryNew) {
		getTitleHistoryNews().remove(titleHistoryNew);
		titleHistoryNew.setNote(null);

		return titleHistoryNew;
	}

}