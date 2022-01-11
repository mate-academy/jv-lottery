package core.basesyntax;

import javax.swing.*;
import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int randomNum = random.nextInt(100);
        return new Ball(randomNum, colorSupplier.getRandomColor());
    }
}
