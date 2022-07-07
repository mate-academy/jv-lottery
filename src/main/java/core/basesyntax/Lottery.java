package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int bound = 100;
    private Random random = new Random();

    public String getRandomBall() {
        int index = random.nextInt(bound);
        return "Color: " + new ColorSupplier().getRandomColor() + " and number: " + index;
    }
}
