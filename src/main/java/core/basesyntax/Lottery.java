package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int RANDNUMBER = 101;
    static final Random random = new Random();

    public static Ball getRandomBall() {
        int randNumber = random.nextInt(RANDNUMBER);
        return new Ball(randNumber, ColorSupplier.getRandomColor());
    }
}
