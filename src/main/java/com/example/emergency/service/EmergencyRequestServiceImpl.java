package com.example.emergency.service;

import com.example.emergency.dto.*;
import com.example.emergency.exception.EmergencyNotFoundException;
import com.example.emergency.model.*;
import com.example.emergency.repository.EmergencyRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class EmergencyRequestServiceImpl
        implements EmergencyRequestService {

    private final EmergencyRequestRepository repository;

    @Override
    public EmergencyRequestResponseDto create(
            EmergencyRequestCreateDto dto
    ) {
        EmergencyRequest request = new EmergencyRequest(
                null,
                dto.getUserId(),
                dto.getLatitude(),
                dto.getLongitude(),
                HelpType.valueOf(dto.getHelpType()),
                EmergencyStatus.CREATED,
                dto.getMedicalInfo(),
                LocalDateTime.now()
        );

        EmergencyRequest saved = repository.save(request);
        return map(saved);
    }

    @Override
    public EmergencyRequestResponseDto updateStatus(
            Long id,
            String status
    ) {
        EmergencyRequest request = repository.findById(id)
                .orElseThrow(() -> new EmergencyNotFoundException(id));

        request.setStatus(EmergencyStatus.valueOf(status));
        return map(repository.save(request));
    }

    private EmergencyRequestResponseDto map(
            EmergencyRequest request
    ) {
        return new EmergencyRequestResponseDto(
                request.getId(),
                request.getUserId(),
                request.getHelpType().name(),
                request.getStatus().name(),
                request.getCreatedAt()
        );
    }
}
