package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int NumberBound = 100;

    public Ball getRandomBall() {
        String randomColor = ColorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(NumberBound);
        return new Ball(randomColor, randomNumber);
    }
}
