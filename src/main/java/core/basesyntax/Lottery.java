package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        int randomNum = new Random().nextInt(100);
        Ball nextBall = new Ball(randomNum, ColorSupplier.getRandomColor());
        return nextBall;
    }
}
