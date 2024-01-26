package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();

    private static ColorSupplier ballColor = new ColorSupplier();

    public static Ball getRandomBall() {
        int ballNumber = random.nextInt(100);
        return new Ball(ballColor.getRandomColor(), ballNumber);
    }
}
