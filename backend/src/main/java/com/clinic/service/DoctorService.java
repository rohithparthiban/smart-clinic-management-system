package com.clinic.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DoctorService {

    // Filter available times based on date
    public List<String> getAvailableTimes(Long doctorId,String date){

        List<String> times = new ArrayList<>();

        if(date.equals("2026-03-15")){
            times.add("09:00");
            times.add("11:00");
            times.add("14:00");
        }

        return times;
    }

    // Validate doctor login credentials
    public Map<String,String> loginDoctor(String email,String password){

        Map<String,String> response=new HashMap<>();

        if(email.equals("doctor@clinic.com") && password.equals("password")){
            response.put("status","success");
            response.put("message","Login successful");
        }else{
            response.put("status","error");
            response.put("message","Invalid credentials");
        }

        return response;
    }
}
