package core.basesyntax;

import static core.basesyntax.Application.MAX_POSSIBLE_NUMBER_FOR_BALL;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),
                random.nextInt(MAX_POSSIBLE_NUMBER_FOR_BALL));
    }
}
