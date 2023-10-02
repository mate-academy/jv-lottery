package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball newOne = new Ball();
        newOne.setNumber(new Random().nextInt(100));
        newOne.setColor(ColorSupplier.getRandomColor());
        return newOne;
    }
}
