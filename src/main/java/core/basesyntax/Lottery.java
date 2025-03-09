package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(100);
        return new Ball(color, number);
        //return new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(100);
    }
}
