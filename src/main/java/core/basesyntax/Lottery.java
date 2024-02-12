package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUM = 100;
    private final ColorSupplier randomColor = new ColorSupplier();
    private final Random randomInt = new Random();

    public Ball getRandomBall() {
        return new Ball(randomColor.getRandomColor(), randomInt.nextInt(MAX_NUM));
    }
}
