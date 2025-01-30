package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        String colorRandom = new ColorSupplier().getRandomColor();
        int randomNumber = new Random().nextInt(100);

        return new Ball(colorRandom, randomNumber);
    }
}
