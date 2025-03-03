package core.basesyntax;

import java.util.Random;

public class Ball {
    int number;
    Colors color;

    public Ball() {
        number = new Random().nextInt(100);
        color = new ColorSupplier().getRandomColor();
    }

    @Override
    public String
    toString() {
        return "Ball{" +
                "number=" + number +
                ", color='" + color + '\'' +
                '}';
    }
}
