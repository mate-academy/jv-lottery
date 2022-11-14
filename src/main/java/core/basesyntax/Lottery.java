package core.basesyntax;

import java.util.Random;

public class Lottery {
    public  Ball getRandomBall() {
        int ballNumber = new Random().nextInt(101);
        ColorSupplier colorSupplier = new ColorSupplier();
        String colorOfBall = colorSupplier.getRandomColor();
        return new Ball(colorOfBall, ballNumber);
    }
}
