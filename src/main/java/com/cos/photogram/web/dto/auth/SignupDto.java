package com.cos.photogram.web.dto.auth;

import com.cos.photogram.domain.user.User;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class SignupDto {

    @Size(min=2,max = 20)
    private String username;
    @Size(min=2)
    private String password;
    @NotBlank
    private String name; // 이름
    @Email
    private String email;

    public User toEntity(){
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();

    }
}
