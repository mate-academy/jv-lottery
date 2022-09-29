package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BALL = 100;
    private final Random randomNum;
    private final ColorSupplier randomColor;

    public Lottery(Random randomNum, ColorSupplier randomColor) {
        this.randomNum = randomNum;
        this.randomColor = randomColor;
    }

    public Ball getRandomBall() {
        return new Ball(randomColor.getRandomColor(), randomNum.nextInt(NUMBER_BALL));
    }
}
