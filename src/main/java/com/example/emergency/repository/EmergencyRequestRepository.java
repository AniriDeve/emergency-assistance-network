package com.example.emergency.repository;

import com.example.emergency.model.EmergencyRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmergencyRequestRepository
        extends JpaRepository<EmergencyRequest, Long> {
}
