package com.twoguys.spring_websockets_angular_chatapp.Service;


import com.twoguys.spring_websockets_angular_chatapp.Dto.UserDTO;
import com.twoguys.spring_websockets_angular_chatapp.Model.User;
import com.twoguys.spring_websockets_angular_chatapp.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserRepo userRepo;

    @Override
    public void createUserAccount(UserDTO userDTO) {
        userRepo.save(convertUserDTOToUser(userDTO));
    }

    private User convertUserDTOToUser(UserDTO userDTO){
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));
        user.setEnabled(true);
        user.setRole(userDTO.getRole());
        return user;
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
