package com.cybrilla.bank.system.bankingSystem.services;

import java.util.List;

import com.cybrilla.bank.system.bankingSystem.dto.UserDto;

public interface UserOperationServices {
	public void createUser(UserDto userdto);
    public List<UserDto> getUser();
    public UserDto findById(Long id);
    public UserDto update(UserDto userdto, Long id);
    public void deleteUserById(Long id);
    public UserDto updatePartially(UserDto userdto, Long id);
}
