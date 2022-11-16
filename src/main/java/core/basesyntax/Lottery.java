package core.basesyntax;

import java.util.Random;

public class Lottery {    
    private static final Random RANDOM = new Random();

    public static Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(), RANDOM.nextInt(101));
    }
}
