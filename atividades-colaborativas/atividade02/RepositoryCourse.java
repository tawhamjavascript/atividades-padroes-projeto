import java.util.HashMap;
import java.util.Map;

public class RepositoryCourse {

    private Map<String, Course> courses;
    private static RepositoryCourse instance ;

    private RepositoryCourse () {
        if (courses == null) {
            courses = new HashMap<String, Course>();
            courses.put("ChatGPT em detalhes", new Course("ChatGPT em detalhes", 100.00));
            courses.put("BlockChain", new Course("BlockChain",90.00));
            courses.put("Iot", new Course("Iot", 80.00));
            courses.put("Realidade virtual", new Course("Realidade virtual", 70.00));
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
