package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
