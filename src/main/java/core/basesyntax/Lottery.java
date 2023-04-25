package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    public static Ball getRandomBall() {
        int number = random.nextInt(100);
        String color = ColorSupplier.getRandomColor().toString();
        return new Ball(color, number);
    }
}
