package com.twoguys.spring_websockets_angular_chatapp.Repository;

import com.twoguys.spring_websockets_angular_chatapp.Model.DummyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<DummyUser, Long> {
}
