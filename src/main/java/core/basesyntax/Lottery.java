package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);

    }
}
