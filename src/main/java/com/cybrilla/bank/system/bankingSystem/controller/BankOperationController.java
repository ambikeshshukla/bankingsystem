package com.cybrilla.bank.system.bankingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybrilla.bank.system.bankingSystem.dto.BankOperationDto;
import com.cybrilla.bank.system.bankingSystem.dto.UserBankSummaryDto;
import com.cybrilla.bank.system.bankingSystem.services.BankOperationServices;

@RestController
@RequestMapping(value={"/operation"})
public class BankOperationController {

	@Autowired
	BankOperationServices bankOperationServices;
	
	@PostMapping(value="/credit",headers="Accept=application/json")
    public ResponseEntity<Void> creditBalance(@RequestBody BankOperationDto bankOperationDto){
		bankOperationServices.creditOrDebitBalance(bankOperationDto);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
	
	@PostMapping(value="/debit",headers="Accept=application/json")
    public ResponseEntity<Void> debitBalance(@RequestBody BankOperationDto bankOperationDto){
		bankOperationServices.creditOrDebitBalance(bankOperationDto);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
	
	@PostMapping(value="/banksummary",headers="Accept=application/json")
    public ResponseEntity<UserBankSummaryDto> getBalanceSummary(@RequestBody BankOperationDto bankOperationDto){
		UserBankSummaryDto balanceSummary = bankOperationServices.getBalanceSummary(bankOperationDto.getId());
        return new ResponseEntity<UserBankSummaryDto>(balanceSummary, HttpStatus.OK);
    }
}
