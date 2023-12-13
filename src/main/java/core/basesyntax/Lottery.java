package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall(){
        int index = new Random().nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(index, colorSupplier.getRandomColor());
    }
}
