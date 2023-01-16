package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int ballNumber;

    public Ball getRandomBall() {
        int constant = 100;
        ColorSupplier secondColor = new ColorSupplier();
        ballNumber = new Random().nextInt(constant);
        Ball second = new Ball(secondColor.getRandomColor(),ballNumber);
        return second;
    }
}
