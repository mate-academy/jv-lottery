package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    public Ball getRandomBall() {
        Color color = new ColorSupplier().getRandomColor();
        int randomNumber = random.nextInt(101);

        return new Ball(color, randomNumber);
    }
}
