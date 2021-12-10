package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private Random random = new Random();
    private int randomNumber = random.nextInt(100);
    private String randomColor = getRandomColor();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(randomNumber);
        ball.setColor(randomColor);
        return ball;
    }
}
