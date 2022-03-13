package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        Color color = Color.valueOf(new ColorSupplier().getRandomColor());
        return new Ball(color, random.nextInt(100));
    }
}
