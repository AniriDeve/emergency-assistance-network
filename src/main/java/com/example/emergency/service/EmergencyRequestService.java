package com.example.emergency.service;

import com.example.emergency.dto.EmergencyRequestCreateDto;
import com.example.emergency.dto.EmergencyRequestResponseDto;

public interface EmergencyRequestService {

    EmergencyRequestResponseDto create(EmergencyRequestCreateDto dto);

    EmergencyRequestResponseDto updateStatus(Long id, String status);
}
