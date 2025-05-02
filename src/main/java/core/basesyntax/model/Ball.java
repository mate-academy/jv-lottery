package core.basesyntax.model;

import core.basesyntax.Color;

public class Ball {
    private Color color;
    private int number;

    public Ball() {
    }

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color=" + color
                + ", number=" + number
                + '}';
    }
}
