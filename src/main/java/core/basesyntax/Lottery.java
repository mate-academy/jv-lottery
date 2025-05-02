package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        String randomColor = ColorSupplier.getRandomColor().name();
        int randomNumber = random.nextInt(100);
        return new Ball(randomColor, randomNumber);
    }
}
