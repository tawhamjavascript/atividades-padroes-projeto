package models;

public class Circle extends Shape{

    private Integer radius;

    public Circle(Integer x, Integer y, String color, Integer radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle.getX().intValue(), circle.getY().intValue(), circle.getColor().toString());
        this.radius = circle.radius.intValue();
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Shape clone() {
        return new Circle(this);
    }
}
