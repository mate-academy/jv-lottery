package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final Random random;
    private final int ballMaxNum = 100;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    private int getRandomBallNumber() {
        return random.nextInt(ballMaxNum);
    }

    public String getRandomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor(random), getRandomBallNumber());
        return ball.toString();
    }
}
