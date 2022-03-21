package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = random.nextInt(100);
        Ball ball = new Ball(colorSupplier.getRandomColor(),number);
        return ball.toString();
    }

}
