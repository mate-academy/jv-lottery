package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int  countNumber = 100;
    private static final Random random = new Random();
    public static Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = random.nextInt(countNumber) + 1;
        return new Ball(color, number);
    }
}
