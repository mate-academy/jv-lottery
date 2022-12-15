package core.basesyntax;

public class Ball extends ColorSopplier {

    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "color='"
                + color
                + '\''
                +
                ", number=" + number
                +
                '}';
    }
}
