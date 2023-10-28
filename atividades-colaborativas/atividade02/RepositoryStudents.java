import java.util.ArrayList;
import java.util.List;

public class RepositoryStudents {

    private List<String> students = new ArrayList<String>();

    private RepositoryStudents() {
        students.add("20212370047");
        students.add("20212370048");
        students.add("20212370049");
        students.add("20212370050");
        students.add("20212370051");
        students.add("20212370052");
        students.add("20212370053");
        students.add("20212370054");
        students.add("20212370055");
        students.add("20212370056");
        students.add("20212370057");
        students.add("20212370058");
        students.add("20212370059");
        students.add("20212370060");
    }

    private static RepositoryStudents instance;

    public static RepositoryStudents getInstance() {
        if (instance == null) {
            instance = new RepositoryStudents();
        }
        return instance;
    } 

    public boolean contains(String student) {
        return students.contains(student);
    }
}
