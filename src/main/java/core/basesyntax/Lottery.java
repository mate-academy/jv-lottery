package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random randomInt = new Random();
    private static final int MAX_RANDOM_NUMBER = 100;
    private final int lotteryDraw;

    public Lottery() {
        this.lotteryDraw = 3;
    }

    public int getLotteryDraw() {
        return lotteryDraw;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(randomInt.nextInt(MAX_RANDOM_NUMBER));
        return ball;
    }
}
