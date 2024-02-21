package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        ball.setColor(color.getRandomColor());
        int randomNumber = new Random().nextInt(100);
        ball.setNumber(randomNumber);
        return ball;
    }
}
