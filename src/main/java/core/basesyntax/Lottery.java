package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int numberR = random.nextInt(100);
        String colorR = ColorSupplier.getRandomColor().toString();
        return new Ball(colorR, numberR);
    }
}
