package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.color + " " + this.number;
    }

    enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        BLACK,
        MAGENTA,
        GRAY
    }
}
