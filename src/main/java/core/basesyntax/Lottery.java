package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    private ColorSupplier ballColor = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(100);
        return new Ball(ballColor.getRandomColor(), ballNumber);
    }
}
