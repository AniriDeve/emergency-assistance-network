package com.example.emergency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class EmergencyRequestResponseDto {

    private Long id;
    private String userId;
    private String helpType;
    private String status;
    private LocalDateTime createdAt;
}
