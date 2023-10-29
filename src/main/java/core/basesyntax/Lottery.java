package core.basesyntax;

import core.basesyntax.objects.Ball;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final int MAX_NUMBER_ON_BALL;
    private final ColorSupplier colorSupplier;

    public Lottery(int MAX_NUMBER_ON_BALL) {
        this.MAX_NUMBER_ON_BALL = MAX_NUMBER_ON_BALL;
        this.random = new Random();
        colorSupplier = new ColorSupplier(random);
    }

    public Ball getRandomBall() {
        String ballColor = colorSupplier.getRandomColor();
        // +1 to include the last number
        int ballRandomNumber = random.nextInt(MAX_NUMBER_ON_BALL) + 1;
        return new Ball(ballColor, ballRandomNumber);
    }
}
