package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final String randomColor = new ColorSupplier().getRandomColor();
    private final int randomNumber = new Random().nextInt(100);

    public Ball getRandomBall() {
        return new Ball(randomColor,randomNumber);
    }
}
