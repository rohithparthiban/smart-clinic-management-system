import org.springframework.stereotype.Service;
import java.util.Base64;

@Service
public class TokenService {

private String secret="smartclinicsecretkey";

public String generateToken(String email){
return Base64.getEncoder().encodeToString(email.getBytes());
}

public String getSigningKey(){
return secret;
}

}
