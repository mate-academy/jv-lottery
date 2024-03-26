package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();
    private static int MAX_NUMBER = 100;

    public static Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER) + 1;
        return new Ball(color, number);
    }
}
