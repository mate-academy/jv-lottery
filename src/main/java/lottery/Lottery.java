package lottery;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class Lottery {

    public static int MAX_NUMBER_BALL = 100;
    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(MAX_NUMBER_BALL));
    }
}
