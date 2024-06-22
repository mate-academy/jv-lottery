package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier suppler = new ColorSupplier();
        int ballNumber = random.nextInt(100);
        String ballColor = suppler.getRandomColor();
        return new Ball(ballColor,ballNumber);
    }
}
