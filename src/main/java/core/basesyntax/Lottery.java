package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        int ballNumber = new Random().nextInt(100);
        ColorSupplier secondColor = new ColorSupplier();
        Ball second = new Ball(secondColor.getRandomColor(),ballNumber);
        return second.toString();
    }
}
