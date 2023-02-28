package core.basesyntax;

public class Ball {
    private Color color;
    private int number;

    Ball (Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball " + color + " " + number;
    }
}