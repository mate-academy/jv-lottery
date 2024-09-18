package core.basesyntax;

import java.util.Random;

public class Lottery {

    final int bound = 100;

    public Ball getRandomBall() {

        ColorSupplier colorSupplier = new ColorSupplier();
        Color ballColor = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(bound);

        return new Ball(ballColor, randomNumber);
    }
}
