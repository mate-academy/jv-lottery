package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    public static int randome() {
        Random myRandom = new Random();
        return myRandom.nextInt(100);
    }

    public static Ball getRandomBall() {
        return new Ball(getRandomColor(), randome());
    }
}
