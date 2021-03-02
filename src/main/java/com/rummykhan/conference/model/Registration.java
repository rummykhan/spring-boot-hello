package com.rummykhan.conference.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

@Data
public class Registration {

    @NotEmpty
    @Max(32)
    private String name;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Max(9)
    private String password;
}
