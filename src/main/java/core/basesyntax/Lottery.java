package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random number = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public void setSupplier(ColorSupplier supplier) {
        this.supplier = supplier;
    }

    public Ball getRandomBall() {

        Ball ball = new Ball();
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(number.nextInt(100));

        return ball;
    }
}
