package com.twoguys.spring_websockets_angular_chatapp.Dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {

    private String username;
    private String name;
    private String password;
    private String role;
    private String email;
}
