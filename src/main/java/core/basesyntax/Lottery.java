package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        int randomInt = random.nextInt(100);
        ball.setNumber(randomInt);
        ball.setColor(ColorSupplier.getRandomColor());
        return ball;
    }
}





