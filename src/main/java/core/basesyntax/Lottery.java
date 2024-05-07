package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;
    public static Ball getRandomBall() {
        return new Ball(ColorSuplier.getRandomColor(), new Random().nextInt(MAX_NUMBER));
    }
}
