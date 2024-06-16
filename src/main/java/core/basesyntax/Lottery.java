package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        String randomColor = ColorSupplier.getRandomColor();

        Ball ball = new Ball();
        ball.color = randomColor;
        ball.number = randomNumber;

        return ball;
    }
}
