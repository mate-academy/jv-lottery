package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {

        Random random = new Random();

        Ball ball = new Ball();

        ColorSupplier supplier = new ColorSupplier();

        ball.setColor(supplier.getRandomColor());

        ball.setNumber(random.nextInt(100) + 1);

        return ball.toString();
    }
}
