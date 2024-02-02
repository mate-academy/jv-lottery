package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {

        String color = ColorSupplier.getRandomColor();
        int num = new Random().nextInt(100);
        Ball ball = new Ball(color, num);
        return ball;
    }
}
