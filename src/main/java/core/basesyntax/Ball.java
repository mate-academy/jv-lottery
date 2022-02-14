package core.basesyntax;

public class Ball {
    Color color;
    int number;

    @Override
    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", number=" + number +
                '}';
    }

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }
}
