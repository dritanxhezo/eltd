package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the StateTransactionError database table.
 * 
 */
@Entity
public class StateTransactionError implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="EntryDate")
	private Timestamp entryDate;

	@Column(name="Error")
	private boolean error;

	@Column(name="ErrorMessage")
	private String errorMessage;

	@Column(name="Report")
	private boolean report;

	//bi-directional many-to-one association to StateCollateralTransaction
	@ManyToOne
	@JoinColumn(name="TransactionID", referencedColumnName="TransactionID")
	private StateCollateralTransaction stateCollateralTransaction;

	public StateTransactionError() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Timestamp entryDate) {
		this.entryDate = entryDate;
	}

	public boolean getError() {
		return this.error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public boolean getReport() {
		return this.report;
	}

	public void setReport(boolean report) {
		this.report = report;
	}

	public StateCollateralTransaction getStateCollateralTransaction() {
		return this.stateCollateralTransaction;
	}

	public void setStateCollateralTransaction(StateCollateralTransaction stateCollateralTransaction) {
		this.stateCollateralTransaction = stateCollateralTransaction;
	}

}