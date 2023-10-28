import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Identified implements State {
    private Kiosk context;

    public Identified(Kiosk context) {
        this.context = context;
    }

    public void changeState() {
        context.setState(new Processing(context));
    }


    public boolean validateRegistration(String matricula) throws Exception {
        throw new UnsupportedOperationException("Você já está identificado");
    }

    public boolean validateCourse(String course) throws Exception {
        RepositoryCourse repositoryCourses = RepositoryCourse.getInstance();
        Map<String, Course> courses = repositoryCourses.getCourses();
        if (courses.containsKey(course)) {
            Course courseObj = courses.get(course);
            if (courseObj.getStudents().size() < courseObj.getMaxStudents()) {
                changeState();
                context.setCourse(courseObj);
                courseObj.addStudent(context.getStudent());
                return true;
            }
            else {
                return false;
            }
        }

        return false;
        
    }

    public boolean validateCreditCard(CreditCard card) throws Exception {

        throw new UnsupportedOperationException("Não pode validar cartão no estado Identificado");
    }

   
    public String createTicket() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Não pode criar ticket no estado Identificado");
    }
}
