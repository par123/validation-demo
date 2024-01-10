package com.parmar.validation.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private int Id;

    @NotEmpty(message = "name should not be empty")
    private String name;

    @Email(message = "provide a valid email address")
    private String email;

    private String birthDate;

    @NotBlank(message = "gender should not be empty")
    private String gender;

    @NotNull(message = "created date should not be empty")
    private String created;

    private String updated;
}
