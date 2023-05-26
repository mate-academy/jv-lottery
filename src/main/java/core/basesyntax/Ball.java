package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public Ball() {
        this.color = new ColorSupplier().getRandomColor();
        this.number = new Random().nextInt(100) + 1;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
