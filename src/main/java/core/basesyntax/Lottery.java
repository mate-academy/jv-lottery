package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();

    public Lottery() {
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSuplier = new ColorSupplier();
        ball.color = colorSuplier.getRandomColor();
        ball.number = random.nextInt(MAX_NUMBER);
        return ball;
    }
}
