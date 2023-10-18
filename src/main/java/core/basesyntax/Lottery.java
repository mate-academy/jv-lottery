package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier colorRandomizer = new ColorSupplier();
        int randomNumber = new Random().nextInt(0, 100);
        return new Ball(colorRandomizer.getRandomColor(), randomNumber);
    }
}
