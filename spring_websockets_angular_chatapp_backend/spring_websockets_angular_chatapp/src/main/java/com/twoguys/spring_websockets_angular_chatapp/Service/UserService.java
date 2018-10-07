package com.twoguys.spring_websockets_angular_chatapp.Service;


import com.twoguys.spring_websockets_angular_chatapp.Dto.UserDTO;

public interface UserService {
    void createUserAccount(UserDTO userDTO);
}
