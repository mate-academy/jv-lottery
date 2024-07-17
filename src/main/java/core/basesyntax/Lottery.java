package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        String color = supplier.getRandomColor();
        int num = new Random().nextInt(100);
        // Ignore the log below (have to commit)
        System.out.println("Some new changes made");

        return new Ball(color, num);
    }
}
