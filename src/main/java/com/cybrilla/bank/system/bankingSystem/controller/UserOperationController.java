package com.cybrilla.bank.system.bankingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybrilla.bank.system.bankingSystem.dto.UserDto;
import com.cybrilla.bank.system.bankingSystem.services.UserOperationServices;

@RestController
@RequestMapping(value={"/user"})
public class UserOperationController {
	
	@Autowired
	UserOperationServices userOperationServices;
	
	@PostMapping(value="/create",headers="Accept=application/json")
    public ResponseEntity<Void> createUser(@RequestBody UserDto userDto){
		userOperationServices.createUser(userDto);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id) {
        UserDto user = userOperationServices.findById(id);
        if (user == null) {
            return new ResponseEntity<UserDto>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<UserDto>(user, HttpStatus.OK);
    }
    

    

    @GetMapping(value="/get", headers="Accept=application/json")
    public List<UserDto> getAllUser() {
        List<UserDto> userDto = userOperationServices.getUser();
        return userDto;

    }

    @PutMapping(value="/update", headers="Accept=application/json")
    public ResponseEntity<String> updateUser(@RequestBody UserDto userDto) {
        UserDto user = userOperationServices.findById(userDto.getId());
        if (user==null) {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        userOperationServices.update(userDto, userDto.getId());
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}", headers ="Accept=application/json")
    public ResponseEntity<UserDto> deleteUser(@PathVariable("id") Long id){
        UserDto user = userOperationServices.findById(id);
        if (user == null) {
            return new ResponseEntity<UserDto>(HttpStatus.NOT_FOUND);
        }
        userOperationServices.deleteUserById(id);
        return new ResponseEntity<UserDto>(HttpStatus.NO_CONTENT);
    }
}
