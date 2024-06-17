package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier ball = new ColorSupplier();

    String getRandomBall() {
        Random random = new Random();
        return (random.nextInt(101) + "   " + ball.getRandomColor());
    }
}