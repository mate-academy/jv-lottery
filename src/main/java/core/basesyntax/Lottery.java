package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(100);
        String rundomColor = colorSupplier.getRandomColor();
        Ball randomBall = new Ball(rundomColor, randomNumber);
        return randomBall;
    }
}
