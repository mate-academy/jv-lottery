package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        supplier.getRandomColor();
        int random = new Random().nextInt(100);
        return "Color: "
                + supplier.getRandomColor().toString()
                + ", "
                + "Number: "
                + String.valueOf(random);
    }
}
