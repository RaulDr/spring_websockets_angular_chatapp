package com.twoguys.spring_websockets_angular_chatapp.Controller;


import com.twoguys.spring_websockets_angular_chatapp.Dto.UserDTO;
import com.twoguys.spring_websockets_angular_chatapp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(path = "/admin/createAccount")
    public void createUserAccount(@RequestBody UserDTO userDTO){
        userService.createUserAccount(userDTO);
    }
}
