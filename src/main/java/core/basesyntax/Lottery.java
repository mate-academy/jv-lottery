package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    
    public Ball getRundomBall() {
        return new Ball(colorSupplier.getRandomColor().toString(), random.nextInt(100));;
    }
}
