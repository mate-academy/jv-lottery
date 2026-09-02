package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        int MAX_BALL_NUMBER = 100;
        int number = new Random().nextInt(MAX_BALL_NUMBER);
        String color = new ColorSupplier().getRandomColor();

        return new Ball(color, number);
    }
}
