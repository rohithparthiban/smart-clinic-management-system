import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class AppointmentService {

public String bookAppointment(Long doctorId, Long patientId){
return "Appointment booked successfully";
}

public List<String> getAppointmentsByDoctorAndDate(Long doctorId, String date){
return List.of("10:00","11:00","14:00");
}

}
