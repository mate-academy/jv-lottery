package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int index = random.nextInt(100);
        Ball ball = new Ball(color, index);
        return ball;
    }

}
