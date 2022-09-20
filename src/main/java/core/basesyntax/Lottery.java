package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier myColorSupplier = new ColorSupplier();
        Color randomColor = myColorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Ball randomBall = new Ball(randomColor, randomNumber);
        return randomBall;
    }
}
