package core.basesyntax;

import java.security.SecureRandom;

public class Lottery {
    int currentNumber = new SecureRandom().nextInt(100 - 1) + 1;
    String currentColor = ColorSupplier.getRandomColor();
    Lottery currentBall = new Ball(currentColor, currentNumber);

}
