package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier supplier = new ColorSupplier();

    public int getRandomNumber() {
       int num = new Random().nextInt(100);
        return num;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball(supplier.getRandomColor(), this.getRandomNumber());
        return ball;
    }
}
