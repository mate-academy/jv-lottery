package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    public void getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(100));
        ball.setColor(colorSupplier.getRandomColor());
        System.out.println(ball);
    }
}
