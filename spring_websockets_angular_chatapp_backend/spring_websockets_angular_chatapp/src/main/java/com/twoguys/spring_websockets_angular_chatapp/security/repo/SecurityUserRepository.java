package com.twoguys.spring_websockets_angular_chatapp.security.repo;



import com.twoguys.spring_websockets_angular_chatapp.security.model.SecurityUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SecurityUserRepository extends JpaRepository<SecurityUser, Long> {

  Optional<SecurityUser> findByUsername(String username);

}
