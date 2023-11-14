import models.Rectangle;
import models.RegisterPrototype;
import models.Shape;
import models.Triangle;

import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RegisterPrototype register = new RegisterPrototype();
        Rectangle shape = new Rectangle(1, 2, "red", 3, 4);
        Rectangle clonedShape = (Rectangle) shape.clone();

       clonedShape.setX(3);
       System.out.println(shape.getX());

       register.addObject(shape);

       Shape shape2 = register.getObject(shape.getColor(), shape.getClass().toString());

       if (shape2 != null) {
           System.out.println(shape2.getX());
       }

        Triangle triangle = new Triangle(1, 2);

       Triangle triangle2 = triangle.clone();

       System.out.println(Objects.equals(triangle, triangle2));



    }
}