package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    
    public Ball getRundomBall() {
        final int bound = 100;
        
        return new Ball(colorSupplier.getRandomColor().toString(),
            random.nextInt(bound));
    }
}
