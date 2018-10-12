package com.twoguys.spring_websockets_angular_chatapp.Dto;

public class UserResponse {
    String content;

    public UserResponse() {
    }

    public String getContent() {
        return content;
    }

    public UserResponse(String content) {
        this.content = content;
    }
}
