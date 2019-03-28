package com.secureregistration.services;

import com.secureregistration.DTO.UserDTO;
import com.secureregistration.custom_exceptions.EmailExistsException;
import com.secureregistration.entities.User;

public interface UserServiceImpl {

    public User registerNewUserAccount(UserDTO accountDto) throws EmailExistsException;
}
