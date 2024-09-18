package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {

        ColorSupplier colorSupplier = new ColorSupplier();
        Color ballColor = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(100);

        return new Ball(ballColor, randomNumber);
    }
}
