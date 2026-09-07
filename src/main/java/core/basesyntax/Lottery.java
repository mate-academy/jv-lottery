package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int number = new Random().nextInt(100);
        Ball ball = new Ball(randomColor, number);

        return ball;
    }
}

