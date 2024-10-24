package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        int randomNumber = new Random().nextInt(100);
        ball.setNumber(randomNumber);
        String randomColor = new ColorSupplier().getRandomColor();
        ball.setColor(randomColor);
        return ball;
    }
}
