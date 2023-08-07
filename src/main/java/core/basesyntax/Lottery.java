package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        String str = new ColorSupplier().getRandomColor();
        int index = new Random().nextInt(100) + 1;
        return new Ball(str, index);
    }
}
