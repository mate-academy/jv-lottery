package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorNew = new ColorSupplier();
    private Random myRandom = new Random();

    public Ball getRandomBall() {
        return new Ball(colorNew.getRandomColor(), myRandom.nextInt(100));
    }
}
