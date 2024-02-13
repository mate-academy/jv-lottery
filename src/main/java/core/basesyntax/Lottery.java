package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BALL_NUMBER = 101;

    private ColorSupplier colorSuplier = new ColorSupplier();
    private Random random = new Random();
    
    public Ball getRandomBall() {
        return new Ball(colorSuplier.getRandomColor(), random.nextInt(MAX_AMOUNT_OF_BALLS));
    }
}
