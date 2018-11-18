package com.cybrilla.bank.system.bankingSystem.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cybrilla.bank.system.bankingSystem.dto.BankOperationDto;
import com.cybrilla.bank.system.bankingSystem.dto.BankSummaryDto;
import com.cybrilla.bank.system.bankingSystem.dto.UserBankSummaryDto;
import com.cybrilla.bank.system.bankingSystem.entity.BankSummary;
import com.cybrilla.bank.system.bankingSystem.entity.User;
import com.cybrilla.bank.system.bankingSystem.repository.UserRepository;
import com.cybrilla.bank.system.bankingSystem.services.BankOperationServices;

@Service
@Transactional
public class BankOperationServicesImpl implements BankOperationServices {

	@Autowired
	UserRepository repository;
	
	@Override
	public UserBankSummaryDto getBalanceSummary(Long id) {
		User user = repository.getOne(id);
		List<BankSummaryDto> bankSummary = new ArrayList<>();
		UserBankSummaryDto userBankSummaryDto = new UserBankSummaryDto();
		Set<BankSummary> dbbankSummaries = user.getBankSummary();
		for(BankSummary dbbankSummary : dbbankSummaries) {
			bankSummary.add(new BankSummaryDto(dbbankSummary));
		}
		userBankSummaryDto.setBanksummary(bankSummary);
		userBankSummaryDto.setAccountType(user.getAccountType());
		userBankSummaryDto.setName(user.getName());
		userBankSummaryDto.setEmailId(user.getEmailId());
		userBankSummaryDto.setGender(user.getGender());
		
		return userBankSummaryDto;
		
	}

	@Override
	public void creditOrDebitBalance(BankOperationDto bankOperationDto) {
		User user = repository.getOne(bankOperationDto.getId());
		switch (bankOperationDto.getOperationType()) {
			case CREDIT:
				Set<BankSummary> bankSummaries = user.getBankSummary();
				BankSummary bankSummary = new BankSummary();
				bankSummary.setDeposit(bankOperationDto.getBalance());
				bankSummary.setMode("ATM");
				if(bankSummaries == null || bankSummaries.isEmpty()) {
					bankSummary.setTotalBalance(bankOperationDto.getBalance());
					user.setTotalBalance(bankOperationDto.getBalance());
				} else {
					bankSummary.setTotalBalance(user.getTotalBalance() + bankOperationDto.getBalance());
				}
				bankSummaries.add(bankSummary);
				repository.save(user);
				break;
			case DEBIT:
				
				if(user.getTotalBalance() < 0) {
					System.out.println("Not Enough Balance");
				} else {
					bankSummaries = user.getBankSummary();
					bankSummary = new BankSummary();
					bankSummary.setWithdraw(bankOperationDto.getBalance());
					bankSummary.setMode("ATM");
					bankSummary.setTotalBalance(user.getTotalBalance() - bankOperationDto.getBalance());
				}
				
				break;
			default:
				break;
		}
	}
}
