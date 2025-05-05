package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private final int lotteryDraw;

    public Lottery() {
        this(100, 3);
    }

    public Lottery(int numberOfBalls) {
        this(numberOfBalls, 3);
    }

    public Lottery(int numberOfBalls, int lotteryDraw) {
        this.numberOfBalls = numberOfBalls;
        this.lotteryDraw = lotteryDraw;
    }

    public int getNumberOfBalls() {
        return numberOfBalls;
    }

    public int getLotteryDraw() {
        return lotteryDraw;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(new Random().nextInt(numberOfBalls));
        return ball;
    }
}
