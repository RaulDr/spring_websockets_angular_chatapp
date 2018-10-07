package com.twoguys.spring_websockets_angular_chatapp.Controller;

import com.twoguys.spring_websockets_angular_chatapp.Model.DummyUser;
import com.twoguys.spring_websockets_angular_chatapp.Service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@RestController
@RequestMapping({"", "/"})
public class DummyController {

    @Autowired
    DummyService dummyService;

    @GetMapping
    public String getDummy(){
        LocalDate localDate = LocalDate.now();
        DummyUser dummyUser = new DummyUser();
        dummyUser.setName("userTest");
        dummyUser.setPassword("passTest");
        dummyUser.setCreatedAt(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        dummyUser.setUpdatedAt(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        dummyService.saveDummyUser( dummyUser);
        return "rest is working";
    }
}
