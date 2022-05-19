package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public String getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        int randomNum = random.nextInt(MAX);
        ball.setNumber(randomNum);
        return ball.toString();
    }
}
