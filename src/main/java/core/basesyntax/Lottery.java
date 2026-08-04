package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public Ball getRandomBall() {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        Ball ball = new Ball();
        ball.setNumber(randomInt);
        ball.setColor(getRandomColor());

        return ball;
    }
}
