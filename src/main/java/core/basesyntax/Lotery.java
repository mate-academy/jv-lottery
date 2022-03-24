package core.basesyntax;

import java.util.Random;

public class Lotery {
    private static final int RAN = 100;

    Lotery() {
        getRandomBall();
    }

    public Ball getRandomBall() {
        Ball newBall = new Ball();
        ColorSupplier randomColor = new ColorSupplier();
        Random randBall = new Random();
        newBall.setBall(randomColor.getRandomColor(),randBall.nextInt(RAN));
        return newBall;
    }
}
