package core.basesyntax;

import core.basesyntax.objects.Ball;
import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery() {
        // SHOULD I MAKE RANDOM AS CLASS FIELD OR JUST AS SIMPLE LOCAL FUNCTION VARIABLE ?
        this.random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall(int maxNum) {
        // SHOULD maxNum be included in the range or not ?
        String ballColor = colorSupplier.getRandomColor();
        int ballRandomNumber = random.nextInt(maxNum);
        return new Ball(ballColor, ballRandomNumber);
    }
}
