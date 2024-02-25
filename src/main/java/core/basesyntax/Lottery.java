package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Colors randomColor = ColorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
