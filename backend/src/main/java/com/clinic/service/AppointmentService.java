package com.clinic.service;

import org.springframework.stereotype.Service;
import java.util.*;
import com.clinic.model.Appointment;

@Service
public class AppointmentService {

    private List<Appointment> appointments = new ArrayList<>();

    // Book appointment and store it
    public String bookAppointment(Appointment appointment){
        appointments.add(appointment);
        return "Appointment booked successfully";
    }

    // Retrieve appointments filtered by doctor and date
    public List<Appointment> getAppointmentsByDoctorAndDate(Long doctorId, String date){
        List<Appointment> result = new ArrayList<>();
        for(Appointment a : appointments){
            if(a.getDoctor() != null && a.getDoctor().getId().equals(doctorId)){
                result.add(a);
            }
        }
        return result;
    }
}
