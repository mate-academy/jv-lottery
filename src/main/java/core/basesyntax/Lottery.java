package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        BallColor color = ColorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1;
        return new Ball(color, number);
    }
}
