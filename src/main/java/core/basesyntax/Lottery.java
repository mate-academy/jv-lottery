package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {
        int randomNumber = new Random().nextInt(100);
        String randomColor = ColorSupplier.getRandomColor();

        return new Ball(randomColor, randomNumber);
    }
}
