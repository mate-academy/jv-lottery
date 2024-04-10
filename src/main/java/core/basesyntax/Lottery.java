package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();

        Random random = new Random();
        int ballNumber = random.nextInt(100);
        return new Ball(color.getRandomColor().toString(), ballNumber);
    }
}
