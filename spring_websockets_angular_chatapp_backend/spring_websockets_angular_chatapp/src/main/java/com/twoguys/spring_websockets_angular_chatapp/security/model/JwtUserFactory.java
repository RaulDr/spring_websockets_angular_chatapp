package com.twoguys.spring_websockets_angular_chatapp.security.model;

public final class JwtUserFactory {

  private JwtUserFactory() {}

  public static JwtUser create(String username, String pswd, Long id) {
    return new JwtUser(username, pswd, id);
  }

}
