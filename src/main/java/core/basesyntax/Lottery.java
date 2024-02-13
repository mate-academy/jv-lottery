package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        int number = new Random().nextInt(101);
        return new Ball(number, new ColorSupplier().getRandomColor());
    }
}
