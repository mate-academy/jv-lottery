package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();
    private int maxNumber = 100;

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(maxNumber);
        String randomColor = supplier.getRandomColor();
        return new Ball(randomColor,randomNumber);
    }
}
