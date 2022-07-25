package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random rand = new Random();
        int ballNumber = rand.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        return new Ball(color, ballNumber);
    }
}
