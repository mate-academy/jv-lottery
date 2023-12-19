package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(){
        ColorSupplier c = new ColorSupplier();
        return new Ball(c.getRandomColor(), new Random().nextInt(100));
    }
}
