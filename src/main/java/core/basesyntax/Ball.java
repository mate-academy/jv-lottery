package core.basesyntax;

import java.util.Random;

public class Ball {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Colors color = colorSupplier.getRandomColor();
    private Random random = new Random();
    private int number = random.nextInt(100);

    public Colors getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
