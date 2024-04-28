package com.example.Backend_Traini8_SameerSawale.Service;

import com.example.Backend_Traini8_SameerSawale.DTOs.RequestDTOs.CenterReqDto;
import com.example.Backend_Traini8_SameerSawale.DTOs.ResponseDTOs.CenterResDto;

import java.util.List;

public interface CenterService {

    public CenterResDto addCenter(CenterReqDto centerReqDto);

    public List<CenterResDto> getAllCenters();
}
