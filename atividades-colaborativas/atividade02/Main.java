import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kiosk contexto = new Kiosk();

        while (true) {
            if (!contexto.hasAvailableCourse()) {
                System.out.println("Não há mais cursos disponíveis");
                break;
            }
            else {
                List<String> userResponse = new ArrayList<String>(); 
                List<String> input = contexto.input();
                for (String string : input) {
                    System.out.print(string);
                    userResponse.add(sc.nextLine());
   
                }
                System.out.println(contexto.validate(userResponse));

            }
        }
    }
}