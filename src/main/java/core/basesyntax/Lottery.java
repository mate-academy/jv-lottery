package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {

    public String getRandomBall() {
        int number;
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomBall = new Random();
        number = randomBall.nextInt(100);
        return number + " " + colorSupplier.getRandomColor();
    }
}
