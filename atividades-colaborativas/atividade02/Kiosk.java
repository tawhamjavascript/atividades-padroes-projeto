import java.util.List;
import java.util.Map;

public class Kiosk {

    private State state;
    private String student;
    private Course course;

    RepositoryCourse repositoryCourse = RepositoryCourse.getInstance();
    RepositoryStudents repositoryStudents = RepositoryStudents.getInstance();

    public Kiosk() {
        this.state = new OnHold(this);
    }

    public void changeState() {
        this.state.changeState();
    }

    public List<Course> getCourses() {
    
        return repositoryCourse.getCourses().entrySet().stream().map(Map.Entry::getValue).toList();
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean validateRegistration(String input) throws Exception {
        return state.validateRegistration(input);
    }

    public boolean validateCreditCard(CreditCard card) throws Exception {
        return state.validateCreditCard(card);
    }

    public boolean validateCourse(String course) throws Exception {
        return state.validateCourse(course);
    }

    public String createTicket() throws Exception {
        return state.createTicket();
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudent() {
        return this.student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return this.course;
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
