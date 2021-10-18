package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int randNumber = new Random().nextInt(100);
        String randColorFromEnum = new ColorSupplier().getRandomColor();
        return new Ball(randNumber,randColorFromEnum);
    }
}
