package com.parmar.validation.requests;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {

    @NotEmpty
    private int id;
    private String country;
    private String city;
    private String state;
    private String zipCode;
    private String street;
    @NotNull
    private int userId;
}
