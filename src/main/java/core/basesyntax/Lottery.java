package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String colorOfBall = colorSupplier.getRandomColor();
        Random random = new Random();
        int numberOfBall = random.nextInt(101);
        return new Ball(colorOfBall, numberOfBall);
    }
}
