package core.basesyntax;

import java.util.Random;


public class Lottery {
    ColorSupplier ball1 = new ColorSupplier();

    public String getRandomBall() {
        Random random = new Random();
        return (random.nextInt(101) + "   " + ball1.getRandomColor());
    }
}