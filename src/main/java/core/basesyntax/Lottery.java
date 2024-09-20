package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final int MAX_BALL_NUMBER = 100;
    private static final String color = new ColorSupplier().getRandomColor();


    public Ball getRandomBall() {
        int number = random.nextInt(MAX_BALL_NUMBER);
        return new Ball(color, number);
    }
}