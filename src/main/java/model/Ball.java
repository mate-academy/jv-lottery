package model;

import enums.Color;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return this.color;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='"
                + this.getColor()
                + '\''
                + ", number="
                + this.getNumber()
                + '}';
    }
}
