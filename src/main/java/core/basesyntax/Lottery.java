package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        return new Ball(Color.valueOf(new ColorSupplier().getRandomColor()), getRandomNumber());
    }

    private static int getRandomNumber() {
        return new Random().nextInt(100) + 1;
    }
}
