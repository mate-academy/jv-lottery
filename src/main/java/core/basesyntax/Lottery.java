package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM = 100;
    private String color = new ColorSupplier().getRandomColor();
    private int number = new Random().nextInt(MAX_RANDOM);

    public Ball getRandomBall() {
        Ball ball = new Ball(color, number);
        return ball;
    }
}
