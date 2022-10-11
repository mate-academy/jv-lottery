package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorNew = new ColorSupplier();
    Random myRandom = new Random();

    public Ball getRandomBall() {
        return new Ball(colorNew.getRandomColor(), myRandom.nextInt(100));
    }
}
