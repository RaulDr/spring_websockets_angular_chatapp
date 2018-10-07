package com.twoguys.spring_websockets_angular_chatapp.Repository;

import com.twoguys.spring_websockets_angular_chatapp.Model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
    UserInfo findByUsername(String username);
}
