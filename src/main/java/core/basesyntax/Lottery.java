package core.basesyntax;

import core.basesyntax.ball.Ball;
import core.basesyntax.ball.Color;
import core.basesyntax.ball.ColorSupplier;

import java.util.Random;

public class Lottery {

    private static final int BOUND = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();

    public String getRandomBall() {
        final int indexColor = new Random().nextInt(Color.values().length);
        int number = random.nextInt(BOUND);
        return new Ball(colorSupplier.getRandomColor(), number).toString();
    }

}
