import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

@GetMapping("/availability")
public ResponseEntity<String> getAvailability() {
return ResponseEntity.ok("Doctor availability endpoint");
}

}
