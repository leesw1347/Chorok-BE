package com.finalproject.chorok.myPlant.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Setter
@Getter
@NoArgsConstructor
public class MyPlantRequestDto {
    private String plantNo;
    private String myPlantPlaceCode;
    private String myPlantImgUrl;
    private String myPlantName;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private String startDay;
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private LocalDate endDay;

    public MyPlantRequestDto(String plantNo, String myPlantPlaceCode, String myPlantImgUrl, String myPlantName
//            ,LocalDate endDay
    ){
        this.plantNo = plantNo;
        this.myPlantPlaceCode = myPlantPlaceCode;
        this.myPlantImgUrl = myPlantImgUrl;
        this.myPlantName = myPlantName;
//        this.startDay = startDay;
//        this.endDay = endDay;

    }



}
