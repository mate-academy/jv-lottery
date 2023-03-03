package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    
    public Ball getRundomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor().toString(), random.nextInt(100));
        return ball;
    }
}
