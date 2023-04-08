package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final Random RANDOM = new Random();

    public static Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = RANDOM.nextInt(100);
        return new Ball(color, number);
    }
}
