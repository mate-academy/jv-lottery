package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall () {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int ballNumber = new Random().nextInt(100);
        return "Ball Color " + color + " and number " + ballNumber;
    }
}
