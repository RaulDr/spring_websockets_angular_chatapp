package com.twoguys.spring_websockets_angular_chatapp.Repository;

import com.twoguys.spring_websockets_angular_chatapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findById(Long id);
    Optional<User> findByUsername(String name);

}