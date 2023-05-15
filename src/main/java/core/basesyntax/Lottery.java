package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {

        Random random = new Random();
        int numberOfBall = random.nextInt(100);

        Ball ball = (Ball) new Ball();
        ball.setNumber(numberOfBall);
        ball.setColor(ColorSupplier.getRandomColor());
        return ball;

    }

}
