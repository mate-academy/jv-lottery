package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier cs = new ColorSupplier();
        int randomNumber = new Random().nextInt(100);
        Ball ball = new Ball();
        ball.setColor(cs.getRandomColor());
        ball.setNumber(randomNumber);
        return ball;
    }
}
