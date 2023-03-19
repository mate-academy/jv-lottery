package core.basesyntax;

import java.util.Random;

public class Lottery {
    public void getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor("" + colorSupplier.getRandomColor());
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        System.out.println(ball);
    }
}
