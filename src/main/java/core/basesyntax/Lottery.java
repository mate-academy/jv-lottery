package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(ColorSupplier.getRandomColor());
        Random rand = new Random();
        ball.setNumber(rand.nextInt(100));
        return ball;
    }

}
