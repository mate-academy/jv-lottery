package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall(){
        return new Ball(random.nextInt(101), colorSupplier.getRandomColor());
    }
}
