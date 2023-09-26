package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String rundomColor = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(100);
        Ball randomBall = new Ball(rundomColor, randomNumber);
        return randomBall.toString();
    }
}
