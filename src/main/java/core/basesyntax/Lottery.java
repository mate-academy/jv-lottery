package core.basesyntax;

import core.basesyntax.objects.Ball;
import java.util.Random;

public class Lottery {
    private final Random random;
    private static final int maxNumberOnTheBall = 100;
    private final ColorSupplier colorSupplier;

    public Lottery() {
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
