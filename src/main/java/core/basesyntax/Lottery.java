package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(100);
        String randomColor = colorSupplier.getRandomColor().name();
        return new Ball(randomColor, randomNumber);
    }
}
