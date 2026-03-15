package com.clinic.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @PostMapping("/{token}")
    public ResponseEntity<Map<String,String>> savePrescription(
            @PathVariable String token,
            @Valid @RequestBody Map<String,String> prescription){

        Map<String,String> response = new HashMap<>();
        response.put("status","success");
        response.put("message","Prescription saved successfully");

        return ResponseEntity.ok(response);
    }
}
