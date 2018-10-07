package com.twoguys.spring_websockets_angular_chatapp.security.service;

import com.twoguys.spring_websockets_angular_chatapp.security.model.JwtUser;
import com.twoguys.spring_websockets_angular_chatapp.security.model.JwtUserFactory;
import com.twoguys.spring_websockets_angular_chatapp.security.model.SecurityUser;
import com.twoguys.spring_websockets_angular_chatapp.security.repo.SecurityUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by stephan on 20.03.16.
 */
@Service
public class LoginServiceImpl implements LoginService {

  @Autowired
  private SecurityUserRepository userRepo;

  @Override
  public JwtUser loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<SecurityUser> user = userRepo.findByUsername(username);

    if (!user.isPresent()) {
      throw new UsernameNotFoundException(
          String.format("No user found with the username '%s'.", username));
    } else {
      return JwtUserFactory.create(user.get().getUsername(), user.get().getPassword(),
          user.get().getId());
    }
  }
}
