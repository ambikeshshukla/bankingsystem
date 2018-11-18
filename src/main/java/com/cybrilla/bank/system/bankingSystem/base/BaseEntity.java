package com.cybrilla.bank.system.bankingSystem.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BaseEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	private Long createdAt;
	private Long updatedAt;
	
	public BaseEntity() {}

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
	 * @return the createdAt
	 */
	public Long getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the updatedAt
	 */
	public Long getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(Long updatedAt) {
		this.updatedAt = updatedAt;
	}
}
	
