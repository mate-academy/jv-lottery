package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random number = new Random();
    ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {

        Ball ball = new Ball();
        ball.color = supplier.getRandomColor();
        ball.number = number.nextInt(100);

        return ball;
    }
}
