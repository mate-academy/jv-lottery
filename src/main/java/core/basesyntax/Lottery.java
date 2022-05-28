package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Random random = new Random();
        return new Ball(color.getRandomColor(), random.nextInt(100));
    }

}
