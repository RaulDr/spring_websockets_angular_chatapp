package com.twoguys.spring_websockets_angular_chatapp.Service;

import com.twoguys.spring_websockets_angular_chatapp.Model.DummyUser;
import com.twoguys.spring_websockets_angular_chatapp.Repository.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyServiceImpl implements DummyService{

    @Autowired
    DummyRepository dummyRepository;


    @Override
    public void saveDummyUser(DummyUser dummyUser) {
        dummyRepository.save(dummyUser);
    }

    @Override
    public List<DummyUser> getUsers() {
        return dummyRepository.findAll();
    }
}
