package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {
        Colors randomColor = ColorSupplier.getRandomColor();
        int randomIndex = new Random().nextInt(100) + 1;

        return new Ball(randomColor, randomIndex);
    }

}
