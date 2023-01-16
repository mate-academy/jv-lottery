package core.basesyntax;

import java.util.Random;

public class Lottery {
    static int ballNumber;
    ColorSupplier secondColor = new ColorSupplier();
    static int constant=100;
    public Ball getRandomBall() {
        ballNumber = new Random().nextInt(constant);
        Ball second = new Ball(secondColor.getRandomColor(),ballNumber);
        return second;
    }
}
