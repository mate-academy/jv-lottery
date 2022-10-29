package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int getRandomNumber() {
        return new Random().nextInt(100);
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
