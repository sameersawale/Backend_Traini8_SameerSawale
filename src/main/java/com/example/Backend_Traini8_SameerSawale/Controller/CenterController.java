package com.example.Backend_Traini8_SameerSawale.Controller;

import com.example.Backend_Traini8_SameerSawale.DTOs.RequestDTOs.CenterReqDto;
import com.example.Backend_Traini8_SameerSawale.DTOs.ResponseDTOs.CenterResDto;
import com.example.Backend_Traini8_SameerSawale.Service.CenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CenterController {

    @Autowired
    CenterService centerService;

//    to add new training center
    @PostMapping("/add")
    public ResponseEntity<CenterResDto> addCenter(@RequestBody @Valid CenterReqDto centerReqDto){

        CenterResDto centerResDto = centerService.addCenter(centerReqDto);
        return new ResponseEntity<>(centerResDto, HttpStatus.CREATED);

    }

//    to get all training centers
    @GetMapping("/get")
    public ResponseEntity<?> getAllCenters(){
        List<CenterResDto>centerResDtoList=centerService.getAllCenters();
        return new ResponseEntity<>(centerResDtoList, HttpStatus.FOUND);
    }
}
