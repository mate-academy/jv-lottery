package core.basesyntax;

import java.util.Random;

public class Lottery {
    /*the constant name is made in camel case because the checkstyle plugin gives an error on
    the naming with two capital letter in the row */
    private final int numberLimit = 101;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(numberLimit));
    }
}
