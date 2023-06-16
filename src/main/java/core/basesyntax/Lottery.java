package core.basesyntax;

import java.util.Random;

public class Lottery {
<<<<<<< HEAD
    private static final int MAX_VALUE = 100;
=======
>>>>>>> 0e0b5a21f1f2fc9729c4521a1e748cd6d0624947
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
<<<<<<< HEAD
        String color = colorSupplier.getRandomColor().name();
        int number = random.nextInt(MAX_VALUE);
=======
        String color = colorSupplier.getRandomColor().toString();
        int number = random.nextInt(100);
>>>>>>> 0e0b5a21f1f2fc9729c4521a1e748cd6d0624947
        return new Ball(color, number);
    }
}
