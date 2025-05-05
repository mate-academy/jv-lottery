package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public Ball(String color, int namber) {
        this.color = color;
        this.number = namber;
    }

    @Override
    public String toString() {
        return color + " " + number;
    }
}
