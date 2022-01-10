package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        int rNum = new Random().nextInt(100);
        Ball nextBall = new Ball(rNum, ColorSupplier.getRandomColor());
        return nextBall;
    }
}
