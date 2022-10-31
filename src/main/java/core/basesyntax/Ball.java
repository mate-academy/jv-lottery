package core.basesyntax;

import java.util.Random;

public class Ball {
    String color;
    int number = new Random().nextInt(100);

    public Ball () {
        this.color = new ColorSupplier().getRandomColor().toString();
    }

    @Override
    public String toString() {
        return "core.basesyntax.Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
