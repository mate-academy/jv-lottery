package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();

    public Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1;
        return new Ball(color, number);
    }
}
