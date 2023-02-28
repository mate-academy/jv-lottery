package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int COUNT_NUMBER = 100;
    private Random random = new Random();

    public Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = random.nextInt(COUNT_NUMBER) + 1;
        return new Ball(color, number);
    }
}
