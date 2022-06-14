package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int bound = 100;
        Random numberBall = new Random();
        int ballNumber = numberBall.nextInt(bound);
        ColorSupplier colorBall = new ColorSupplier();
        Color ballColor = colorBall.getRandomColor();
        return new Ball(ballColor, ballNumber);
    }
}
