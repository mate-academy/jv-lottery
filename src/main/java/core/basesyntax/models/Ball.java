package core.basesyntax.models;

import core.basesyntax.models.enums.Color;

public class Ball {
    private Color color;
    private byte number;

    public Ball(Color color, byte number) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Color - %s; Number - %d;", this.color.name(), number);
    }
}
