import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{

Patient findByEmail(String email);

@Query("SELECT p FROM Patient p WHERE p.email=?1 OR p.phone=?2")
Patient findByEmailOrPhone(String email,String phone);

}
