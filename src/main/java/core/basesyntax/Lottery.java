package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random randomNumber = new Random();
    ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = randomNumber.nextInt(100);
        Color ballColor = randomColor.getRandomColor();
        return new Ball(ballColor.toString(), ballNumber);
    }
}
