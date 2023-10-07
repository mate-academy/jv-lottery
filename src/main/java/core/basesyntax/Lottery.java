package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        String randomColor = new ColorSupplier().getRandomColor();
        int randNumbers = new Random().nextInt(100);
        ball.setColor(randomColor);
        ball.setNumber(randNumbers);
        return ball;
    }
}
