package com.cybrilla.bank.system.bankingSystem.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cybrilla.bank.system.bankingSystem.dto.UserDto;
import com.cybrilla.bank.system.bankingSystem.entity.User;
import com.cybrilla.bank.system.bankingSystem.repository.UserRepository;
import com.cybrilla.bank.system.bankingSystem.services.UserOperationServices;

@Service
@Transactional
public class UserOperationServicesImpl implements UserOperationServices {

	@Autowired
	UserRepository repository;
	
	@Override
	public void createUser(UserDto userdto) {
		User user = new User();
		convertDtoToEntity(user, userdto);
		repository.save(user);
	}

	@Override
	public List<UserDto> getUser() {
		List<User> users = repository.findAll();
		List<UserDto> userDtos = new ArrayList<>();
		for(User user : users) {
			userDtos.add(new UserDto(user));
		}
		return userDtos;
	}

	@Override
	public UserDto findById(Long id) {
		return new UserDto(repository.getOne(id));
	}

	@Override
	public UserDto update(UserDto userdto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDto updatePartially(UserDto userdto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void convertDtoToEntity(User entity, UserDto dto) {
		entity.setName(dto.getName());
		entity.setUserName(dto.getUserName());
		entity.setGender(dto.getGender());
		entity.setAccountType(dto.getAccountType());
		entity.setPassword(dto.getPassword());
		entity.setEmailId(dto.getEmailId());
	}

}
