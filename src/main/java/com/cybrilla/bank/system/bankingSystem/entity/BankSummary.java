package com.cybrilla.bank.system.bankingSystem.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cybrilla.bank.system.bankingSystem.base.BaseEntity;

@Entity
@Table(name = "banksummary")
public class BankSummary extends BaseEntity {
	private String mode;
	private Long deposit;
	private Long withdraw;
	private Long totalBalance;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
	
	public BankSummary() {}

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
