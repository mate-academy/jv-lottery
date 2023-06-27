package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random randomBallNumber = new Random();

        return new Ball(
                String.valueOf(ColorSupplier.getRandomColor()),
                randomBallNumber.nextInt(100)
        );
    }
}
