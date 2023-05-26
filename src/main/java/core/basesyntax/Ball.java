package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(String color, int numbers) {
        this.color = color;
        this.number = numbers;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "color='"
                + color + '\''
                +
                ", numbers=" + number
                +
                '}';
    }
}
