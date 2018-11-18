package com.cybrilla.bank.system.bankingSystem.dto;

import java.io.Serializable;

import com.cybrilla.bank.system.bankingSystem.enums.OperationType;

public class BankOperationDto implements Serializable {
	private Long id;
	private Long balance;
	private OperationType operationType;
	
	public BankOperationDto(){}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the balance
	 */
	public Long getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	/**
	 * @return the operationType
	 */
	public OperationType getOperationType() {
		return operationType;
	}
	/**
	 * @param operationType the operationType to set
	 */
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}
	
}
