package models;

import java.util.HashMap;

public class RegisterPrototype {

    private HashMap<String, Shape> shapes = new HashMap<String, Shape>();


    public void addObject(Shape shape) {
        this.shapes.put(shape.getColor() + shape.getClass().toString(), shape);
    }

    public Shape getObject(String color, String type) {
        Shape shape = this.shapes.get(color + type);
        return shape.clone();
    }
}
