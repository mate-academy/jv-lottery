package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = RANDOM.nextInt(100) + 1;

        Ball ball = new Ball(color, number);

        return ball;
    }

}
