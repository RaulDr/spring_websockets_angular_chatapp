package com.twoguys.spring_websockets_angular_chatapp.Controller;

import com.twoguys.spring_websockets_angular_chatapp.Controller.CommonResponses.Success;
import com.twoguys.spring_websockets_angular_chatapp.Dto.UserDTO;
import com.twoguys.spring_websockets_angular_chatapp.Service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(path = "/user/createAccount")
    public ResponseEntity<?> createUserAccount(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO);
        userService.createUserAccount(userDTO);
        return (ResponseEntity<?>) ResponseEntity.notFound();
    }
}
