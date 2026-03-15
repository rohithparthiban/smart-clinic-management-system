package com.clinic.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @GetMapping("/{user}/{doctorId}/{date}/{token}/availability")
    public ResponseEntity<Map<String,String>> getAvailability(
            @PathVariable String user,
            @PathVariable Long doctorId,
            @PathVariable String date,
            @PathVariable String token){

        Map<String,String> response = new HashMap<>();

        if(token == null || token.isEmpty()){
            response.put("status","error");
            response.put("message","Invalid token");
            return ResponseEntity.status(401).body(response);
        }

        response.put("status","success");
        response.put("doctorId",doctorId.toString());
        response.put("date",date);
        response.put("message","Doctor availability retrieved successfully");

        return ResponseEntity.ok(response);
    }
}
