package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String randomColor = colorSupplier.getRandomColor();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int randomNumber = new Random().nextInt(100);
        ball.setColor(randomColor);
        ball.setNumber(randomNumber);
        return ball;
    }
}
