package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        Random random = new Random();
        int numberRandom = random.nextInt(101);
        return new Ball(randomColor.getRandomColor().toString(), numberRandom);
    }
}
