package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(ColorSupplier.getRandomColor());
        Random random = new Random();
        int randomInt = random.nextInt(101);
        ball.setNumber(randomInt);
        return ball;
    }
}
