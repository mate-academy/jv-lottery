package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        ball.color = ColorSupplier.getRandomColor();
        ball.number = randomNumber;

        return ball;
    }
}
