package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor().toString();
        Random random = new Random();
        int number = random.nextInt(100);
        return new Ball(color, number);
    }
}
