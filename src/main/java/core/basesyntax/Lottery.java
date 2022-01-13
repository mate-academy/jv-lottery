package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    public Ball getRandomBall() {
        int currentNumber = new SecureRandom().nextInt(100 - 1) + 1;
        ColorSupplier ballColor = new ColorSupplier();
        String currentColor = ballColor.getRandomColor();
        Ball ball = new Ball(currentColor, currentNumber);
        return ball;
    }
}

