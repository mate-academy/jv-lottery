package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int HUNDRED = 100;
    private ColorSupplier supplier = new ColorSupplier();
    private int random = new Random().nextInt(HUNDRED);

    public String getRandomBall() {
        return "Color: "
                + supplier.getRandomColor().name()
                + ", "
                + "Number: "
                + random;
    }
}
