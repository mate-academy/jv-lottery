package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        Ball ball = new Ball();
        ball.setNumber(value);

        ColorSupplier supplier = new ColorSupplier();
        ball.setColor(supplier.getRandomColor());
        System.out.println(ball);
        return ball.toString();
    }

}
