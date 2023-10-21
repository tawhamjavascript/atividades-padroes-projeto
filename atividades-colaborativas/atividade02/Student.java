import java.util.ArrayList;
import java.util.List;

public class Student {
    private String registrationId;

    public Student(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getRegistrationId() {
        return registrationId;
    }
        
    public String toString() {
        return "Student [registrationId=" + registrationId + "]";
    }
}
