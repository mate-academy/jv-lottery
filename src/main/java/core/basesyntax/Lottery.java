package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {
        Ball newBall = new Ball(ColorSupplier.getRandomColor(), new Random().nextInt(0, 100));

        return newBall;
    }
}
