import java.util.List;
import java.util.Map;

public class Kiosk {

    private State state;
    private Student student;
    private Course course;

    RepositoryCourse repositoryCourse = RepositoryCourse.getInstance();

    public Kiosk() {
        this.state = new OnHold(this);
    }
    
    public void setState(State state) {
        this.state = state;
    }


    public Student getStudent() {
        return student;
    }


    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }


    public void setCourse(Course course) {
        this.course = course;
    }

    public String validate(List<String> input) {
        return state.validate(input);
    }

    public List<String> input() {
        return state.input();
    }
    
    public boolean hasAvailableCourse() {
        for(Map.Entry<String, Course> curso : repositoryCourse.getCourses().entrySet()) {
            if (curso.getValue().getStudents().size() < curso.getValue().getMaxStudents()) {
                return true;
            }
        }
        return false;
    }
}
