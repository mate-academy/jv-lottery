package core.basesyntax.classes;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private String randomColor = colorSupplier.getRandomColor();
    private int randomNumber = random.nextInt(100) + 1;

    public Ball getRandomBall() {
        return new Ball(randomColor, randomNumber);
    }
}
