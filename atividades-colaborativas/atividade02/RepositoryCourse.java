import java.util.HashMap;
import java.util.Map;

public class RepositoryCourse {

    private Map<String, Course> courses;
    private static RepositoryCourse instance ;

    private RepositoryCourse () {
        if (courses == null) {
            courses = new HashMap<String, Course>();
            courses.put("GPT", new Course("GPT", 100.00));
            courses.put("BLOCKCHAIN", new Course("BLOCKCHAIN",90.00));
            courses.put("IOT", new Course("IOT", 80.00));
            courses.put("VR", new Course("VR", 70.00));
        }

    }

    public Course getCourse(String name) {
        return courses.get(name);

    }

    public Map<String, Course> getCourses() {
        return courses;
    }
    
    public static RepositoryCourse getInstance() {
        if (instance == null) {
            instance = new RepositoryCourse();
        }
        return instance;
    }
}
