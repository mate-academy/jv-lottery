package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        String color = new ColorSupplier().getRandomColor();
        int number = new Random().nextInt(100);
        Ball ball = new Ball(color, number);
        return ball;
    }
}
