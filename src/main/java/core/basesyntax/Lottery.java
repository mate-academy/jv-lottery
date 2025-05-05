package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        String color = randomColor.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER);
        return new Ball(color, randomNumber);
    }
}
