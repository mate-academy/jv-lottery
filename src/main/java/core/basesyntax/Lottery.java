package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    private static final int maxNumber = 100;
    Ball getRandomBall() {
        return  new Ball(colorSupplier.getRandomColor(), random.nextInt(maxNumber));
   }
}
