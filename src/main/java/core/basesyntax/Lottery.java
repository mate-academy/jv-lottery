package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;
    public static final ColorSuplier colorSuplier = new ColorSuplier();
    private static Random random = new Random();

    public static Ball getRandomBall() {
        return new Ball(colorSuplier.getRandomColor(), random.nextInt(MAX_NUMBER));
    }
}
