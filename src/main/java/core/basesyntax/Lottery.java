package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        int randomNumber = random.nextInt(100); // число від 0 до 100
        Color color = colorSupplier.getRandomColor();
        return new Ball(color, randomNumber);

    }
}
