package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Lottery(String color, int number) {
        super();
    }

    public Lottery() {
        super();
    }

    public Ball getRandomBall() {
        Random random = new Random();

        String color = ColorSupplier.getRandomColor();

        int number = random.nextInt(100);
        return new Ball(color, number);

    }
}
