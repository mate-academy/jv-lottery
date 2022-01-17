package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        int currentNumber = new SecureRandom().nextInt(100 - 1) + 1;
        String currentColor = colorSupplier.getRandomColor();
        return new Ball(currentColor, currentNumber);
    }
}

