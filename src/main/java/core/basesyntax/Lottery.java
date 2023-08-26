package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random randomNumber = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = randomNumber.nextInt(100);
        Color ballColor = randomColor.getRandomColor();
        return new Ball(ballColor.toString(), ballNumber);
    }
}
