package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(MAX_NUMBER);
        String randomColor = new ColorSupplier().getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
