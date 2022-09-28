package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int numberOfBall = 100;

    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        Random randomNum = new Random();
        return new Ball(randomColor.getRandomColor(), randomNum.nextInt(numberOfBall));
    }
}
