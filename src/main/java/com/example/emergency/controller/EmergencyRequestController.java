package com.example.emergency.controller;

import com.example.emergency.dto.*;
import com.example.emergency.service.EmergencyRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/emergency")
@RequiredArgsConstructor
public class EmergencyRequestController {

    private final EmergencyRequestService service;

    @PostMapping
    public EmergencyRequestResponseDto create(
            @RequestBody EmergencyRequestCreateDto dto
    ) {
        return service.create(dto);
    }

    @PutMapping("/{id}/status")
    public EmergencyRequestResponseDto updateStatus(
            @PathVariable Long id,
            @RequestParam String status
    ) {
        return service.updateStatus(id, status);
    }
}
