package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    public Ball(String color, int number) {
        this.color = Color.valueOf(color);
        this.number = number;
    }

    @Override
    public String toString() {
        return this.color + ", " + this.number;
    }
}
