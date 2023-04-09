package core.basesyntax;

public class Ball {
    private final String color;
    private final int numbers;

    public Ball(String color, int numbers) {
        this.color = color;
        this.numbers = numbers;
    }

    public String getColor() {
        return color;
    }

    public int getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "color='"
                + color + '\''
                +
                ", numbers=" + numbers
                +
                '}';
    }
}
