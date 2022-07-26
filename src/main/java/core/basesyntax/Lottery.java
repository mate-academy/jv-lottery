package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random rnd = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    int HUNDRED = 100;

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().toString();
        int number = rnd.nextInt(HUNDRED);
        Ball ball = new Ball(color, number);
        return ball;

    }
}
