package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random myRandom = new Random();
        int index = myRandom.nextInt(100);

        return new Ball(ColorSupplier.getRandomColor(), index);
    }
}
