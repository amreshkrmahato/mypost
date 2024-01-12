package com.blog.payload;

import lombok.Data;

@Data
public class SignUpDto {
    private String email;
    private String name;
    private String password;
    private String username;
}

