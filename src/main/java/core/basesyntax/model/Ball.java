package core.basesyntax.model;

import core.basesyntax.enums.Color;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number='" + number + '\''
                + '}';
    }
}
