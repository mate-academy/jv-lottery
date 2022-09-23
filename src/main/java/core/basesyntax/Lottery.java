package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_RND = 100;
    public Ball getRandomBall() {
        SetOfColors rndColor = ColorSupplier.getRandomColor();
        int random = new Random().nextInt(NUMBER_RND);
        return new Ball(rndColor, random);
    }
}
