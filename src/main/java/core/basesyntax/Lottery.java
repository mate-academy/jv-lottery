package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_BOUND = 101;

    public Ball getRandomBall() {
        String color = String.valueOf(new ColorSupplier().getRandomColor());
        int randomNumber = new Random().nextInt(MAX_BOUND);
        return new Ball(color, randomNumber);
    }
}
