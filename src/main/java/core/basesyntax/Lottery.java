package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();

    public String getRandomBall() {
        int randomInt = random.nextInt(101);
        Ball ball = new Ball(colorSupplier.getRandomColor(), randomInt);
        return ball.toString();
    }
}
