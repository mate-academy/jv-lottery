package core.basesyntax;

import core.basesyntax.ball.Ball;
import core.basesyntax.ball.Color;
import core.basesyntax.ball.ColorSupplier;
import java.util.Random;

public class Lottery {

    private static final int BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public String getRandomBall() {
        int number = random.nextInt(BOUND);
        return new Ball(colorSupplier.getRandomColor(), number).toString();
    }

}
