package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        int randomNumber = random.nextInt(100);
        String randomColor = supplier.getRandomColor();
        Ball ball = new Ball(randomColor,randomNumber);
        return ball;
    }
}
