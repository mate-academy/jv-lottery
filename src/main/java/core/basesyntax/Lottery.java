package core.basesyntax;

import java.util.Random;

public class Lottery {
    private  int value;
    private static final int bound = 100;

    public String getRandomBall() {
        value = new Random().nextInt(bound);
        return "Color: " + new ColorSupplier().getRandomColor() + " and number: " + value;
    }
}
