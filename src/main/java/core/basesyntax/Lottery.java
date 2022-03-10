package core.basesyntax;

import java.util.Random;

/**
 * @version 1.0
 * @autor shd
 * @created by 27/02/2022 - 17:49
 * @project jv-lottery
 */

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(100);
        return new Ball(number, colorSupplier.getRandomColor());
    }
}
