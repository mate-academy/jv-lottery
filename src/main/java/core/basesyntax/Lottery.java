package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_BALL = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Colors randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER_BALL + 1);

        return new Ball(randomColor, randomNumber);
    }

}
