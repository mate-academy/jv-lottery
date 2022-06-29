package core.basesyntax;

import java.util.Random;
public class Lottery {
    protected Ball getRandomBall() {
        Random random = new Random();
        int index = random.nextInt(100);
        ColorSupplier supplier = new ColorSupplier();
        String color = supplier.getRandomColor().toString();
        return new Ball(color, index);
    }
}
