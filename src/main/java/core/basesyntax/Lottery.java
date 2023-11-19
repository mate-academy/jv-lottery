package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int randomNumber = new Random().nextInt(100);
        ball.setNumber(randomNumber);
        ball.setColor(new ColorSupplier().getRandomColor());
        return ball;
    }
}
