package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int ballNum = new Random().nextInt(100);
        Ball randomBall = new Ball();
        randomBall.setNumber(ballNum);
        randomBall.setColor(new ColorSupplier().getRandomColor());
        return randomBall;
    }
}
