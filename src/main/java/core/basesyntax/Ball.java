package core.basesyntax;

import java.util.Random;

public class Ball {
    private String color;
    private int number;

    public Ball() {

        this.color = new ColorSupplier().getRandomColor().toString();
        this.number = new Random().nextInt(100);
    }

    @Override
    public String toString() {
        return "core.basesyntax.Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}
