package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        int ballNumber = new Random().nextInt(100);
        String colorOfBall = ColorSupplier.getRandomColor();
        return new Ball(colorOfBall, ballNumber);
    }
}
