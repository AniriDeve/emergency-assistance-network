package com.example.emergency.exception;

public class EmergencyNotFoundException extends RuntimeException {

    public EmergencyNotFoundException(Long id) {
        super("Emergency request not found: " + id);
    }
}
