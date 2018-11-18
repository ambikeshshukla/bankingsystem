package com.cybrilla.bank.system.bankingSystem.dto;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.OneToMany;

import com.cybrilla.bank.system.bankingSystem.entity.User;
import com.cybrilla.bank.system.bankingSystem.enums.AccountType;

public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1531796330710306824L;
	
	private Long id;
	private String name;
	private String emailId;
	private AccountType accountType;
	private String gender;
	private String userName;
	private String password;
	private Long totalBalance;
	
	public UserDto() {}

	
	public UserDto(User user) {
		setId(user.getId());
		setName(user.getName());
		setGender(user.getGender());
		setEmailId(user.getEmailId());
		setAccountType(user.getAccountType());
	}
	
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
