package com.twoguys.spring_websockets_angular_chatapp.security.service;

import com.twoguys.spring_websockets_angular_chatapp.security.model.JwtUser;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface LoginService extends UserDetailsService {

  JwtUser loadUserByUsername(String username) throws UsernameNotFoundException;
}
