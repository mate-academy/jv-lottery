package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int number = new Random().nextInt(100);
        String randomColor = new ColorSupplier().getRandomColor();
        return new Ball(Color.valueOf(randomColor), number);
    }
}