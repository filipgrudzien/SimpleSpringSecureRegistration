package com.secureregistration.repositories;

import com.secureregistration.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    // https://www.youtube.com/watch?v=xRE12Y-PFQs


}
