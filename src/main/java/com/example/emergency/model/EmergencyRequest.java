package com.example.emergency.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "emergency_requests")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmergencyRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;

    private Double latitude;
    private Double longitude;

    @Enumerated(EnumType.STRING)
    private HelpType helpType;

    @Enumerated(EnumType.STRING)
    private EmergencyStatus status;

    private String medicalInfo;

    private LocalDateTime createdAt;
}
