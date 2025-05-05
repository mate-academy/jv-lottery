package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_LOTTERY_NUM = 100;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_LOTTERY_NUM);
        return new Ball(randomColor.getRandomColor(), randomNumber);
    }
}
