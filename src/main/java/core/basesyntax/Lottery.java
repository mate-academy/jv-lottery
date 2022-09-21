package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        SetOfColors rndColor = ColorSupplier.getRandomColor();
        int random = new Random().nextInt(100);
        return new Ball(rndColor, random);
    }
}
