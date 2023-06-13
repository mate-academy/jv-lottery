package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static int MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String ballColor = colorSupplier.getRandomColor();
        int numberOfBall = random.nextInt(MAX_NUMBER);
        return new Ball(ballColor, numberOfBall);
    }
}
