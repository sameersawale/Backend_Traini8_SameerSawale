package com.example.Backend_Traini8_SameerSawale.DTOs.ResponseDTOs;

import com.example.Backend_Traini8_SameerSawale.Entity.Address;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class CenterResDto {

    private String centerName;

    private String centerCode;

    private Address address;

    private int capacity;

    private List<String> coursesOffered;

    private LocalDate createdOn;

    private String contactEmail;

    private String contactPhone;
}
