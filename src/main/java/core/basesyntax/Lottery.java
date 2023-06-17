package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static int MAX_NUMBER = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER);
        return new Ball(color, number);
    }
}
