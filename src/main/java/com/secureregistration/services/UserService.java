package com.secureregistration.services;

import com.secureregistration.DTO.UserDTO;
import com.secureregistration.custom_exceptions.EmailExistsException;
import com.secureregistration.entities.User;
import com.secureregistration.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class UserService implements UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public User registerNewUserAccount(UserDTO accountDto) throws EmailExistsException {

        if (checkIfEmailExist(accountDto.getEmail())) {
            throw new EmailExistsException(
                    "There is an account with that email address:" + accountDto.getEmail());
        }
        User user = new User();
        user.setFirstName(accountDto.getFirstName());
        user.setLastName(accountDto.getLastName());
        user.setPassword(accountDto.getPassword());
        user.setEmail(accountDto.getEmail());
        //user.setRoles(Arrays.asList("ROLE_USER"));
        return userRepository.save(user);

    }

    private boolean checkIfEmailExist(String email) {
        User user = userRepository.findByEmail(email);
        if (user != null) {
            return true;
        }
        return false;
    }
}
