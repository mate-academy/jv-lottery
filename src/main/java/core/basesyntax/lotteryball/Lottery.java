package core.basesyntax.lotteryball;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setBallColor(colorSupplier.getRandomColor());
        ball.setBallNumber(random.nextInt(100));
        return ball;
    }

    public void getRandom(Random random) {
        this.random = random;
    }

    public void getColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }
}
