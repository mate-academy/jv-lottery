package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAGIC_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int numberRandom = random.nextInt(MAGIC_NUMBER);
        String colorRandom = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setNumber(numberRandom);
        ball.setColor(colorRandom);
        return ball;
    }
}
