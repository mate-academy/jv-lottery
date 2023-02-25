package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        String color = String.valueOf(getRandomColor());
        Random random = new Random();
        int index = random.nextInt(100 + 1);
        Ball ball = new Ball(color, index);
        return ball;
    }
}
