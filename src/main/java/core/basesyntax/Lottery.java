package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    private ColorSupplier getBallColor = new ColorSupplier();

    public Ball getRandomBall() {
        int currentNumber = new SecureRandom().nextInt(100 - 1) + 1;
        String currentColor = getBallColor.getRandomColor();
        Ball ball = new Ball(currentColor, currentNumber);
        return ball;
    }
}

