package models;

public class Rectangle extends Shape{

    private Integer width;
    private Integer height;

    public Rectangle(Integer x, Integer y, String color, Integer width, Integer height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }


    public Rectangle(Rectangle rectangle) {
        super(rectangle.getX().intValue(), rectangle.getY().intValue(), rectangle.getColor().toString());
        this.width = rectangle.width.intValue();
        this.height = rectangle.height.intValue();
    }
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


    public Shape clone() {
        return new Rectangle(this);
    }
}
