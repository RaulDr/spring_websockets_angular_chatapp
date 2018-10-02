package com.twoguys.spring_websockets_angular_chatapp.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "dummyuser")
@Setter
public class DummyUser extends AuditModel{

    //TODO:let's see about this
    @Id
    @GeneratedValue(generator = "user_generator")
    @SequenceGenerator(
            name = "user_generator",
            sequenceName = "user_sequance",
            initialValue = 1000)
    private Long id;

    @NotBlank
    @Size(min=3, max = 100)
    private String name;

    @Column(columnDefinition = "text")
    private String password;
}
