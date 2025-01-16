package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {

        Random random = new Random();

        String color = new ColorSupplier().getRandomColor();
        int number = random.nextInt(100);
        return new Ball(color, number);
    }
}
