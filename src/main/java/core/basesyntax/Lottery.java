package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int number = random.nextInt(100);
        ball.setNumber(number);
        Color color = colorSupplier.getRandomColor();
        ball.setColor(color.name());
        return ball;
    }
}
