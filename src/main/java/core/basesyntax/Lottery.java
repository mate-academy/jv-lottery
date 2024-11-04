package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), (new Random().nextInt(100)));
    }

}
