package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    public static Ball getRandomBall() {
        int index = random.nextInt(ColorBol.values().length);
        ColorBol color = ColorSupplier.getRandomColor();
        int number = random.nextInt(100);
        return new Ball(color.name(),number);
    }
}
