package core.basesyntax;

import core.basesyntax.objects.Ball;
import java.util.Random;

public class Lottery {
    private final Random random;
    private final int maxNumberOnTheBall;
    private final ColorSupplier colorSupplier;

    public Lottery(int maxNumberOnTheBall) {
        this.maxNumberOnTheBall = maxNumberOnTheBall;
        this.random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        String ballColor = colorSupplier.getRandomColor();
        int ballRandomNumber = random.nextInt(maxNumberOnTheBall)+1; // +1 to include the last number
        return new Ball(ballColor, ballRandomNumber);
    }
}
