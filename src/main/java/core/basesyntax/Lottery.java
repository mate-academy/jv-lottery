package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(){
        int index = new Random().nextInt(100);
        return new Ball(new ColorSupplier().getRandomColor(), index);
    }
}
