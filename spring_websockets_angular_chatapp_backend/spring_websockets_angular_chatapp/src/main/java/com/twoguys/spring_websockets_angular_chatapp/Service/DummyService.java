package com.twoguys.spring_websockets_angular_chatapp.Service;

import com.twoguys.spring_websockets_angular_chatapp.Model.DummyUser;

import java.util.List;

public interface DummyService {
    void saveDummyUser(DummyUser dummyUser);
    List<DummyUser> getUsers();
}
