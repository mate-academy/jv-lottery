package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(int number, String color) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball has color " + color + " and has number " + number;
    }
}
