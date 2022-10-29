package core.basesyntax;

import java.util.Random;

public class Lottery {
    final int MAX_VALUE = 100;

    private int getRandomNumber() {
        return new Random().nextInt(MAX_VALUE);
    }

    private String getRundomColor() {
        return new ColorSupplier().getRandomColor();
    }

    public Ball getRandomBall() {
        String color = this.getRundomColor();
        int number = this.getRandomNumber();
        return new Ball(color, number);

    }
}
