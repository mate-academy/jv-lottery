package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    public Ball getRandomBall() {
        int randomnumber = random.nextInt(100);
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color, randomnumber);
    }
}
