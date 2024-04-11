package core.basesyntax;

import java.util.Random;

public final class Lottery {
    public static Ball getRandomBall() {
        final Colors RandomColor = ColorSupplier.getRandomColor();
        final Random RandomNumber = new Random();
        final  int RandomBall = RandomNumber.nextInt(101);
        return new Ball(RandomColor, RandomBall);
    }
}
