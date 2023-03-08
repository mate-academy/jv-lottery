package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private final int bound = 100;
    
    public Ball getRundomBall() {
        return new Ball(colorSupplier.getRandomColor().toString(),
            random.nextInt(bound));
    }
}
