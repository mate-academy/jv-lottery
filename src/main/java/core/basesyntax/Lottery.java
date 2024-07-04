package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int maxNumberOfBalls = 100;
        Ball ball = new Ball();
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        ball.setColor(randomColor);
        ball.setNumber(random.nextInt(maxNumberOfBalls));
        return ball;
    }
}
