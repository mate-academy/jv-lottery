package core.basesyntax;

import java.util.Random;

public class Lottery {
    public void getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int randomInt = random.nextInt(100);
        Ball ball = new Ball(colorSupplier.getRandomColor(), randomInt);
        System.out.println(ball);
    }
}
