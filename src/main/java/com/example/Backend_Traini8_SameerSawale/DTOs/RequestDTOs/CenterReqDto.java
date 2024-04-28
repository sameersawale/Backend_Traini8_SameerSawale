package com.example.Backend_Traini8_SameerSawale.DTOs.RequestDTOs;

import com.example.Backend_Traini8_SameerSawale.Entity.Address;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CenterReqDto {

    @Size(max = 40, message = "Name must be less than 40 char long")
    private String centerName;

    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]{12}$", message = "Center code must be exactly 12 alphanumeric characters")
    private String centerCode;

    private Address address;

    private int capacity;

    private List<String>coursesOffered;

    @Email(message = "Invalid email address")
    private String contactEmail;

    @Pattern(regexp = "(^$|\\d{10})", message = "Phone number must be exactly 10 digits")
    private String contactPhone;
}
