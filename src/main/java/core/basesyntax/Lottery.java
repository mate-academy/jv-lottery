package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = getRandomColor();
        int randomNumber = random.nextInt(100);
        return new Ball(randomColor, randomNumber);
    }
}
