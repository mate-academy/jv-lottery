package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color = new ColorSupplier().getRandomColor();
    private int number = new Random().nextInt(100);

    @Override
    public String toString() {
        return "Ball{"
                + "color='" + color + '\''
                + ", number=" + number
                + '}';
    }
}
