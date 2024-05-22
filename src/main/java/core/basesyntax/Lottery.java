package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier SUPPLIER = new ColorSupplier();

    public String getRandomBall() {
        String color = SUPPLIER.getRandomColor();
        int number = this.getRandomNumber();
        return new Ball(color, number).toString();
    }

    public int getRandomNumber() {
        return new Random().nextInt(100) + 1;
    }
}
