package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier loteria = new ColorSupplier();
    private Random randomValueSupplier = new Random();

    public Ball getRandomBall() {
        int number = randomValueSupplier.nextInt(101);
        return new Ball(loteria.getRandomColor(), number);

    }
}

