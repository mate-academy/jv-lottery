package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball newOne = new Ball();
        newOne.number = new Random().nextInt(100);
        newOne.color = ColorSupplier.getRandomColor();
        return newOne;
    }
}
