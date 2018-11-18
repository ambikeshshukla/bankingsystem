package com.cybrilla.bank.system.bankingSystem.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cybrilla.bank.system.bankingSystem.base.BaseEntity;
import com.cybrilla.bank.system.bankingSystem.enums.AccountType;

@Entity
@Table(name = "user")
public class User extends BaseEntity {
	
	private String name;
	private String emailId;
	private AccountType accountType;
	private String userName;
	private String password;
	private String gender;
	private Long totalBalance;

	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "user")
    private Set<BankSummary> bankSummary = new HashSet<>();
	
	public User() {}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the accountType
	 */
	public AccountType getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * @return the bankSummary
	 */
	public Set<BankSummary> getBankSummary() {
		return bankSummary;
	}


	/**
	 * @param bankSummary the bankSummary to set
	 */
	public void setBankSummary(Set<BankSummary> bankSummary) {
		this.bankSummary = bankSummary;
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
