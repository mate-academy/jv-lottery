package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        int numberball = new Random().nextInt(100);
        ColorSupplier supplier = new ColorSupplier();
        Ball randomball = new Ball();
        randomball.setColor(String.valueOf(supplier.getRandomColor()));
        randomball.setNumber(numberball);
        return randomball;
    }
}
