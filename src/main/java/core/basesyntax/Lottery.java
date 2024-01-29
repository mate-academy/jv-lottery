package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Ball getRandomBall() {
        Color color = new ColorSupplier().getRandomColor();
        int number = random.nextInt(101); //i assume range <0,100>
        return new Ball(color,number);
    }
}
