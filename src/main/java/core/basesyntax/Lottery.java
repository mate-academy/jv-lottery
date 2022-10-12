package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random ballNumber = new Random();
        int value = ballNumber.nextInt(100);
        return supplier.getRandomColor() + value;
    }
}
