package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier newColor = new ColorSupplier();
    private Color randomColor = newColor.getRandomColor();
    private Random random = new Random();
    private int maxNumber = 100;
    private int value = random.nextInt(maxNumber);

    public Ball getRandomBall() {
        Ball newBall = new Ball(value, randomColor);
        System.out.println(value + randomColor.name());
        return newBall;
    }
}