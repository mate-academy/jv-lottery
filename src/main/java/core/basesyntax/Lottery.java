package core.basesyntax;

import java.util.Random;

public class Lottery {
    static int bound = 100;
    Random random = new Random();
    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor().name(), random.nextInt(bound));
    }

}
