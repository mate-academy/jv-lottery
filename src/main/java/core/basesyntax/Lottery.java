package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final int MAX_BALL_NUMBER = 100;
    private Random random = new Random();

    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAX_BALL_NUMBER) + 1;
        return new Ball(color, number);
    }
}
