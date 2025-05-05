package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color, number);
    }

}
