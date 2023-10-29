package core.basesyntax;

import core.basesyntax.objects.Ball;
import java.util.Random;

public class Lottery {
    private final Random random;
    private final int maxNumberOnTheBall;
    private final ColorSupplier colorSupplier;

    public Lottery(int MAX_NUMBER_ON_BALL) {
        this.maxNumberOnTheBall = MAX_NUMBER_ON_BALL;
        this.random = new Random();
        colorSupplier = new ColorSupplier(random);
    }

    public Ball getRandomBall() {
        String ballColor = colorSupplier.getRandomColor();
        // +1 to include the last number
        int ballRandomNumber = random.nextInt(maxNumberOnTheBall) + 1;
        return new Ball(ballColor, ballRandomNumber);
    }
}
