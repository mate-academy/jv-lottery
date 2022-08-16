package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Color ballColor = Color.valueOf(new ColorSupplier().getRandomColor());
        int ballNumber = new Random().nextInt(100);
        return new Ball(ballColor, ballNumber);
    }
}
