package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        ball.setNumber(randomNumber);
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
