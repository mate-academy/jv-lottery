package basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        String randomColor = colorSupplier.getRandomColor().name();
        int randomNumber = random.nextInt(100);
        return new Ball(randomColor, randomNumber);
    }
}
