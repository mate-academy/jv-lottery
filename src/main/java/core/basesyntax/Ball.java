package core.basesyntax;

public class Ball {

    private final int number;
    private final String color;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
