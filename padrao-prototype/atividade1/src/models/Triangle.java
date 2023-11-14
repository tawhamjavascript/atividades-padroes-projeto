package models;

public class Triangle implements Cloneable {
    private Integer base;
    private Integer height;

    public Triangle(Integer base, Integer height) {
        this.base = base;
        this.height = height;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public Triangle clone() {
        try {
            return (Triangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
