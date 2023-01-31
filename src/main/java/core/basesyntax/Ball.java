package core.basesyntax;

public class Ball {
    public Color color;
    public int number;

    public Ball (Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return color.name() + " " + number;
    }
}
