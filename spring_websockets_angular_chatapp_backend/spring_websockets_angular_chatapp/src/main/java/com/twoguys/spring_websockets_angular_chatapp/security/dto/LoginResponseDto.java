package com.twoguys.spring_websockets_angular_chatapp.security.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseDto {
  private String token;
  private long idUser;
  private String username;
}
