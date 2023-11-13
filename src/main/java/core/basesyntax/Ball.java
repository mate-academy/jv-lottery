package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String name() {
        return "Color: " + color + ", number = " + number;
    }
}
