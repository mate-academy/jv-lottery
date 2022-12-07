package core.basesyntax;

import java.util.Random;

public class Lottery {
    @Override
    public String toString() {
        return "Lottery{color = " + getRandomBall().getColor()
                + ", number = " + getRandomBall().getNumber() + "}";
    }

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        int value = random.nextInt(100);

        Ball first = new Ball();
        first.setColor(supplier.getRandomColor().name());
        first.setNumber(value);
        return first;

    }
}
