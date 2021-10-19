package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        String ballColor = new ColorSupplier().getRandomColor();
        int number = new Random().nextInt(100);
        return new Ball(ballColor, number);
    }
}
