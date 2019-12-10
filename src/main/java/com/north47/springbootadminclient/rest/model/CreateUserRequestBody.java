package com.north47.springbootadminclient.rest.model;

import lombok.Data;

@Data
public class CreateUserRequestBody {
    private String firstName;
    private String lastName;
}
