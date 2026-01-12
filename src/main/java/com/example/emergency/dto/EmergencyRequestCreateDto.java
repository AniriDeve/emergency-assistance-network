package com.example.emergency.dto;

import lombok.Data;

@Data
public class EmergencyRequestCreateDto {

    private String userId;
    private Double latitude;
    private Double longitude;
    private String helpType;
    private String medicalInfo;
}
