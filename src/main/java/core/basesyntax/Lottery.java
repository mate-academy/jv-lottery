package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        String randColor = new ColorSupplier().getRandomColor();
        int randInt = new Random().nextInt(100);
        return new Ball(randColor, randInt);
    }
}
