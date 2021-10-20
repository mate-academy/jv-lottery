package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random randomNumber = new Random();
        ColorSupplier randomColor = new ColorSupplier();
        return new Ball(randomColor.getRandomColor(), randomNumber.nextInt(100));
    }
}
