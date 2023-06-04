package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        String randomColor = String.valueOf(ColorSupplier.getRandomColor());
        return new Ball(randomColor, randomNumber);
    }
}
