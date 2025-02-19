package core.basesyntax;

import java.util.Random;

public class Lottery {

    private String ball = "Ball";

    public String getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        supplier.getRandomColor();
        Random random = new Random();
        random.nextInt(100);
        return ball + ": " + supplier.getRandomColor() + "; " + random.nextInt(100);
    }
}
