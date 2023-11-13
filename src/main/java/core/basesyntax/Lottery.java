package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int NUMBER = 100;
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball(new Random().nextInt(NUMBER), randomColor.getRandomColor());
        return ball;
    }
}