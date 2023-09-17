package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int randomInt = random.nextInt(101);

        Ball ball = new Ball(colorSupplier.getRandomColor(), randomInt);
        return ball.toString();
    }
}
