package core.basesyntax;

import java.util.Random;
import model.Ball;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumber = new Random().nextInt(100);
        return new Ball(randomNumber, colorSupplier.getRandomColor());
    }
}
