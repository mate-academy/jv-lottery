package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    public Ball(Colors colors, int number) {
        this.color = colors;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                +
                "color=" + color
                +
                ", number=" + number
                +
                '}';
    }
}
