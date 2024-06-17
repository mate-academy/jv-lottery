package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private Ball.Color colorSupplier = new ColorSupplier().getRandomColor();

    public Ball getRandomBall() {
        int randomInt = random.nextInt(100);
        return new Ball(colorSupplier, randomInt);
    }
}
