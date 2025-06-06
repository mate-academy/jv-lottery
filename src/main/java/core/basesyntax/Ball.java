package core.basesyntax;

public class Ball {
    private RandomColors color;
    private int number;

    public Ball(RandomColors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
            + "color='" + color.name() + '\''
            + ", number=" + number
            + '}';
    }
}
