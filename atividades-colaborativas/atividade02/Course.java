import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Double price;
    private int maxStudents = 1;
    private List<Student> students = new ArrayList<Student>();

    public Course(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public boolean addStudent(Student student) {
        boolean result = students.contains(student);
        if(!result) {
            students.add(student);
        }
        return result; 
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }
}
