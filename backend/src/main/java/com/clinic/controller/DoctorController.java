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
response.put("message","Doctor availability fetched successfully");

return ResponseEntity.ok(response);
}

}
