package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    @Override
    public String toString() {
        return "color = " + color + ", number = " + number;
    }

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }
}
