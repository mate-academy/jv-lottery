import java.util.Random;

abstract class Shape {
    protected String color;
    public Shape(String color) {
        this.color = color;
    }
public abstract double getArea();
public abstract void draw();
}
