package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball number: " + number + ", color: " + color;
    }
}
