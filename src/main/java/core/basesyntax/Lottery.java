package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private int randomNumber = random.nextInt(100);
    private String randomColor = colorSupplier.getRandomColor();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(randomNumber);
        ball.setColor(randomColor);
        return ball;
    }
}
