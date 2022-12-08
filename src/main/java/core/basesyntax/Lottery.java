package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(100);
        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor().name());
        ball.setNumber(number);
        return ball;
    }
}
