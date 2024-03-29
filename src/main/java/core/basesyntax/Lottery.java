package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();

        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(Color.valueOf(ColorSupplier.getRandomColor().name()));

        Random random = new Random();
        int num = random.nextInt(100);
        ball.setNumber(num);

        return ball;
    }
}
