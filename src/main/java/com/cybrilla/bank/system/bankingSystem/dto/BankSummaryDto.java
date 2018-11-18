package com.cybrilla.bank.system.bankingSystem.dto;

import com.cybrilla.bank.system.bankingSystem.entity.BankSummary;

public class BankSummaryDto {
	private String mode;
	private Long deposit;
	private Long withdraw;
	private Long totalBalance;
	
	public BankSummaryDto(){}
	
	public BankSummaryDto(BankSummary summary) {
		setMode(summary.getMode());
		setDeposit(summary.getDeposit());
		setWithdraw(summary.getWithdraw());
		setTotalBalance(summary.getTotalBalance());
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @return the deposit
	 */
	public Long getDeposit() {
		return deposit;
	}

	/**
	 * @param deposit the deposit to set
	 */
	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}

	/**
	 * @return the withdraw
	 */
	public Long getWithdraw() {
		return withdraw;
	}

	/**
	 * @param withdraw the withdraw to set
	 */
	public void setWithdraw(Long withdraw) {
		this.withdraw = withdraw;
	}

	/**
	 * @return the totalBalance
	 */
	public Long getTotalBalance() {
		return totalBalance;
	}

	/**
	 * @param totalBalance the totalBalance to set
	 */
	public void setTotalBalance(Long totalBalance) {
		this.totalBalance = totalBalance;
	}
	
}
