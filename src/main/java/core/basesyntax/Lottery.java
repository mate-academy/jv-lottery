package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {

        Random randomNumber = new Random();
        int value = randomNumber.nextInt(100);
        ColorSupplier oneColor = new ColorSupplier();
        return "number " + value + " color " + oneColor.getRandomColor();
    }
}
