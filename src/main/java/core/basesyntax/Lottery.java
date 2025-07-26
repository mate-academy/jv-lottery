package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXNUMBER = 100;

    public static Ball getRandomBall() {
        final Random rand = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randColor = colorSupplier.getRandomColor();
        Integer randNumber = rand.nextInt(MAXNUMBER);
        Ball randBall = new Ball(randColor, randNumber);
        return randBall;
    }
}
