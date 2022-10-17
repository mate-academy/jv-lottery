package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier newColor = new ColorSupplier();
    private Random random = new Random();
    private int maxNumber = 100;

    public Ball getRandomBall() {
        Color randomColor = newColor.getRandomColor();
        int value = random.nextInt(maxNumber);
        Ball newBall = new Ball(value, randomColor);
        return newBall;
    }
}