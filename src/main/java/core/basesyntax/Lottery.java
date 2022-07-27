package core.basesyntax;

import java.util.Random;

public class Lottery {

    static final int MAX_NUMBER_BALL = 100;

    public Ball getRandomBall() {
        int randomNumberBall = new Random().nextInt(MAX_NUMBER_BALL);
        return new Ball(new ColorSupplier().getRandomColor(), randomNumberBall);
    }
}
