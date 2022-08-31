package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        ball.setColor(color.getRandomColor().toString());
        Random number = new Random();
        ball.setNumber(number.nextInt(100));
        return ball;
    }
}
