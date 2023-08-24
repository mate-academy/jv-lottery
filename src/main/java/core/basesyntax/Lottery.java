package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        String randomColor = getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return new Ball(randomColor, randomNumber);
    }
}
