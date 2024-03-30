package core.basesyntax;

public class Ball {
    private final String color;
    private final String number;

    public Ball(String color, String number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "color='" + color + '\''
                +
                ", number='" + number + '\''
                +
                '}';
    }
}
