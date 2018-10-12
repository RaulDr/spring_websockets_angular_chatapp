package com.twoguys.spring_websockets_angular_chatapp.Repository;

import com.twoguys.spring_websockets_angular_chatapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
