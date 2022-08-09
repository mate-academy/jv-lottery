package core.basesyntax;

import java.util.Random;

public class Lottery {
    private String ball;
    int number = 100;
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(number));
    }
}



