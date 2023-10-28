import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Double price;
    private int maxStudents = 10;
    private List<String> students = new ArrayList<String>();

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

    public boolean addStudent(String student) {
        boolean result = students.contains(student);
        if(!result) {
            students.add(student);
        }
        return result; 
    }

    public List<String> getStudents() {
        return students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }
}
