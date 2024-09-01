package core.basesyntax;

import java.util.Random;
import model.Ball;

public class Lottery {
    private Random rand = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(rand.nextInt(100), colorSupplier.getRandomColor());
    }
}
