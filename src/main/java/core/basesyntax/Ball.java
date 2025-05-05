package core.basesyntax;

public class Ball {
    private int number;
    private Color color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return number + " " + color;
    }
}
