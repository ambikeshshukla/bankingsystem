package com.cybrilla.bank.system.bankingSystem.services;

import com.cybrilla.bank.system.bankingSystem.dto.BankOperationDto;
import com.cybrilla.bank.system.bankingSystem.dto.UserBankSummaryDto;

public interface BankOperationServices {
	public UserBankSummaryDto getBalanceSummary(Long id);
    public void creditOrDebitBalance(BankOperationDto bankOperationDto);
}
