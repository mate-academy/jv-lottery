package core.basesyntax;

public class Ball {
    private final Colors color;
    private final int number;

    public Ball(Colors randomColor, int number) {
        this.color = randomColor;
        this.number = number;
    }

    public Colors getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
