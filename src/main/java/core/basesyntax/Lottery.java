package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int ballNumber = new Random().nextInt(100);
        Color ballColor = new ColorSupplier().getRandomColor();

        return new Ball(ballColor, ballNumber);
    }
}
