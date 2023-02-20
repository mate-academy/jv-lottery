package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(100);
        ball.setColor(randomColor);
        ball.setNumber(randomNumber);
        return ball;
    }
}
