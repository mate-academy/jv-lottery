package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();
    private static Color color;

    public static Ball getRandomBall() {
        int number = random.nextInt(100);
        color = ColorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
