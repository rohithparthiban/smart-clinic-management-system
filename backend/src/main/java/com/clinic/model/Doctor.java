import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="doctor")
public class Doctor {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;
private String speciality;

@ElementCollection
private List<String> availableTimes;

}
