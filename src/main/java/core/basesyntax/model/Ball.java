package core.basesyntax.model;

import core.basesyntax.enums.Color;

public class Ball {

    private Color color;
    private Integer number;

    public Ball(Integer number, Color color) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball {"
                + color
                + ", " + number
                + '}';
    }
}
