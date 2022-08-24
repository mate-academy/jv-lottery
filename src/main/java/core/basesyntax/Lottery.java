package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        //  + 1  is used, because nextInt(MAX_NUMBER) return number in range [0, MAX_NUMBER-1],
        //                                                       but we need [1, MAX_NUMBER]
        Ball randomBall = new Ball(random.nextInt(MAX_NUMBER) + 1, ColorSupplier.getRandomColor());
        return randomBall;
    }
}
