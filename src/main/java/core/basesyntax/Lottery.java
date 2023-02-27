package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier=new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(100);
        Ball ball = new Ball(color, number);
        return ball;
    }
}
