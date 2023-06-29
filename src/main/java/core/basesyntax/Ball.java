package core.basesyntax;

import java.text.MessageFormat;

public class Ball {
    private Enum color;
    private int number;


    Ball(Enum color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", number=" + number +
                '}';
    }
}
