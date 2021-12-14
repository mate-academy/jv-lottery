package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(100);
        String randomColor = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setNumber(randomNumber);
        ball.setColor(randomColor);
        return ball;
    }
}
