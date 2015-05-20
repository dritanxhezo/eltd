package com.vintek.database.model.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the StateCollateralTransaction database table.
 * 
 */
@Entity
public class StateCollateralTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	@Column(name="CollateralID")
	private int collateralID;

	@Column(name="TransactionID")
	private int transactionID;
	
	//bi-directional many-to-one association to StateTransactionError
	@OneToMany(mappedBy="stateCollateralTransaction")
	private List<StateTransactionError> stateTransactionErrors;

	public StateCollateralTransaction() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCollateralID() {
		return this.collateralID;
	}

	public void setCollateralID(int collateralID) {
		this.collateralID = collateralID;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public List<StateTransactionError> getStateTransactionErrors() {
		return this.stateTransactionErrors;
	}

	public void setStateTransactionErrors(List<StateTransactionError> stateTransactionErrors) {
		this.stateTransactionErrors = stateTransactionErrors;
	}

	public StateTransactionError addStateTransactionError(StateTransactionError stateTransactionError) {
		getStateTransactionErrors().add(stateTransactionError);
		stateTransactionError.setStateCollateralTransaction(this);

		return stateTransactionError;
	}

	public StateTransactionError removeStateTransactionError(StateTransactionError stateTransactionError) {
		getStateTransactionErrors().remove(stateTransactionError);
		stateTransactionError.setStateCollateralTransaction(null);

		return stateTransactionError;
	}
}