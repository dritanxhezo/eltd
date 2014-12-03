package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CustomFieldOption database table.
 * 
 */
@Entity
public class CustomFieldOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CustomFieldID")
	private int customFieldID;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="OptionValue")
	private String optionValue;

	public CustomFieldOption() {
	}

	public int getCustomFieldID() {
		return this.customFieldID;
	}

	public void setCustomFieldID(int customFieldID) {
		this.customFieldID = customFieldID;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOptionValue() {
		return this.optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

}