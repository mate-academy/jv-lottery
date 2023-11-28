package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    // Add an empty line before the @Override annotation
    public String toString() {
        return "Ball { Color: " + color + ", Number: " + number + " }";
    }
}
