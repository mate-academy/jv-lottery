package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Ball ball = new Ball();

    public String getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball.toString();
    }
}
