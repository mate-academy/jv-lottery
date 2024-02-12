package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int AMOUNT_OF_BALL = 99;

    
    public Ball getRandomBall() {
        return new Ball(
                new ColorSupplier().getRandomColor(),
                new Random().nextInt(AMOUNT_OF_BALL));
    }
}
