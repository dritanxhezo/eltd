package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TitleBrand database table.
 * 
 */
@Entity
public class TitleBrand implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="Brand")
	private Object brand;

	//bi-directional many-to-one association to Title
	@ManyToOne
	@JoinColumn(name="TitleID")
	private Title title;

	public TitleBrand() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object getBrand() {
		return this.brand;
	}

	public void setBrand(Object brand) {
		this.brand = brand;
	}

	public Title getTitle() {
		return this.title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

}