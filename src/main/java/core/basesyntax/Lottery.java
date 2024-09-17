package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
