package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor().toString();
        int randomNumber = random.nextInt(101);
        return new Ball(randomColor, randomNumber);
    }
}
