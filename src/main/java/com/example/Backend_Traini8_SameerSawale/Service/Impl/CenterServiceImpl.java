package com.example.Backend_Traini8_SameerSawale.Service.Impl;

import com.example.Backend_Traini8_SameerSawale.DTOs.RequestDTOs.CenterReqDto;
import com.example.Backend_Traini8_SameerSawale.DTOs.ResponseDTOs.CenterResDto;
import com.example.Backend_Traini8_SameerSawale.Entity.Center;
import com.example.Backend_Traini8_SameerSawale.Repository.AddressRepository;
import com.example.Backend_Traini8_SameerSawale.Repository.CenterRepository;
import com.example.Backend_Traini8_SameerSawale.Service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CenterServiceImpl implements CenterService {

    @Autowired
    CenterRepository centerRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public CenterResDto addCenter(CenterReqDto centerReqDto) {

//        to convert centerReqDTO to Entity
        Center center=Center.builder()
                .centerName(centerReqDto.getCenterName())
                .centerCode(centerReqDto.getCenterCode())
                .address(centerReqDto.getAddress())
                .capacity(centerReqDto.getCapacity())
                .coursesOffered(centerReqDto.getCoursesOffered())
                .contactEmail(centerReqDto.getContactEmail())
                .contactPhone(centerReqDto.getContactPhone())
                .build();

//        save center to DB
        centerRepository.save(center);

//        save respective address to DB
        addressRepository.save(centerReqDto.getAddress());

        CenterResDto centerResDto=entityToDto(center);
        return centerResDto;
    }

    @Override
    public List<CenterResDto> getAllCenters() {
        List<Center> centerList=centerRepository.findAll();
        List<CenterResDto>centerResDtoList=new ArrayList<>();
        for(Center center:centerList){
            CenterResDto centerResDto=entityToDto(center);
            centerResDtoList.add(centerResDto);
        }
        return centerResDtoList;
    }

//    convert entity to response DTO
    public static CenterResDto entityToDto(Center center){
        CenterResDto centerResDto=CenterResDto.builder()
                .centerName(center.getCenterName())
                .centerCode(center.getCenterCode())
                .address(center.getAddress())
                .capacity(center.getCapacity())
                .coursesOffered(center.getCoursesOffered())
                .createdOn(center.getCreatedOn())
                .contactEmail(center.getContactEmail())
                .contactPhone(center.getContactPhone())
                .build();
        return centerResDto;
    }
}
