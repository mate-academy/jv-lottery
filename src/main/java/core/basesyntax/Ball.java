package core.basesyntax;

public class Ball {
    public Colors color;
    public int number;

    Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color=" + color
                + ", number=" + number
                + '}';
    }
}
