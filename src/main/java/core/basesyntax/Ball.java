package core.basesyntax;

public class Ball {
    final private String color;
    final private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Color is: " + color + "; Number is: " + number;
    }
}
