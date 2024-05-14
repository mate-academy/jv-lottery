package core.basesyntax;

import java.util.Random;


class Lottery {
    public static Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor().toString();
        int number = new Random().nextInt(100) + 1; // Random number from 1 to 100
        return new Ball(color, number);
    }
}

