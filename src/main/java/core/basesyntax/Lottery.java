package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private final int LIMITER = 100;
    Random randomNumber = new Random();
    public Ball getRandomBall() {
        return new Ball(getRandomColor(), randomNumber.nextInt(LIMITER));
    }
}
