package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random1 = new Random();

        Color color = colorSupplier.getRandomColor();
        int number = random1.nextInt(1,101);

        Ball ball = new Ball(color, number);

        return ball;
    }
}
