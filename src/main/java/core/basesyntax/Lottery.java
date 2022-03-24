package core.basesyntax;

import java.util.Random;

public  class Lottery {
    private static final int BOUND = 100;
    public String getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        return String.valueOf(new Ball(colorSupplier.getRandomColor(), random.nextInt(BOUND)));

    }
}
