package core.basesyntax;

import java.util.Random;

public class Lottery {
    Ball getRandomBall() {
        int count = 100;
        Random number = new Random();
        ColorSupplier color = new ColorSupplier();
        Ball ball = new Ball(number.nextInt(count), color.getRandomColor());
        return ball;
    }
}
