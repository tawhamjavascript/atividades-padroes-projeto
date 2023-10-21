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

    public String validate(List<String> input) {
        String nomeCurso = input.get(0);
        switch (nomeCurso) {
            case "1":
                nomeCurso = "ChatGPT em detalhes";
                break;

            case "2":
                nomeCurso = "BlockChain";
                break;
        
            case "3":
                nomeCurso = "Realidade virtual";
                break;

            default:
                nomeCurso = "Iot";
        }

        RepositoryCourse repositoryCourse = RepositoryCourse.getInstance();
        Course course = repositoryCourse.getCourse(nomeCurso);
        if (course.getStudents().size() < course.getMaxStudents()) {
            changeState();
            context.setCourse(course);
            return "Curso com vagas disponíveis";

        } else {
            return "Curso sem vagas disponíveis";
        }
    }


    public List<String> input() {
        StringBuilder result = new StringBuilder();
        int i = 0;
        for(Map.Entry<String, Course> curso : context.repositoryCourse.getCourses().entrySet()) {
            i++;
            result.append("numeração do curso: " + i + " " + curso.getKey() + " vagas Disponíveis: " + (curso.getValue().getMaxStudents() - curso.getValue().getStudents().size()) + "\n");  
        }
        result.append("Digite o número do curso: ");
        return new ArrayList<String>(Arrays.asList(result.toString()));
    }
}
