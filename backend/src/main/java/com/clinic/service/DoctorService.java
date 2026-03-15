import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DoctorService {

public List<String> getAvailableTimes(Long doctorId,String date){
return List.of("09:00","11:00","15:00");
}

public Map<String,String> loginDoctor(String email,String password){
Map<String,String> response=new HashMap<>();
response.put("status","success");
response.put("message","Login successful");
return response;
}

}
