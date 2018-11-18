package com.cybrilla.bank.system.bankingSystem.dto;

import java.util.List;

public class UserBankSummaryDto extends UserDto {

	private List<BankSummaryDto> banksummary;
	
	public UserBankSummaryDto() {}

	/**
	 * @return the banksummary
	 */
	public List<BankSummaryDto> getBanksummary() {
		return banksummary;
	}

	/**
	 * @param banksummary the banksummary to set
	 */
	public void setBanksummary(List<BankSummaryDto> banksummary) {
		this.banksummary = banksummary;
	}
}
