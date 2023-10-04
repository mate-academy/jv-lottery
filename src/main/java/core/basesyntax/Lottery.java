package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall(){
        Random rand = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(),rand.nextInt(100));
    }
}
