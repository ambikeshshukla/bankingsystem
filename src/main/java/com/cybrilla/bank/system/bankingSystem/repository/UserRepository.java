package com.cybrilla.bank.system.bankingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybrilla.bank.system.bankingSystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
