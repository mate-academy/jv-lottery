package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor().name();
        int randomNumber = random.nextInt(101); // Numbers from 0 to 100
        return new Ball(randomColor, randomNumber);
    }
}
