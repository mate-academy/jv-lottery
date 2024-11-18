package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        String rmdclr = new ColorSupplier().getRandomColor();
        int randomIndex = new Random().nextInt(101);
        return new Ball(rmdclr, randomIndex);
    }
}
