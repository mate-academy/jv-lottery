package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(100);
        Colors randomColor = new ColorSupplier().getRandomColor();

        return new Ball(randomColor, randomNumber);
    }
}
