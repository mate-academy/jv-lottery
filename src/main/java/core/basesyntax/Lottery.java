package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Random randomNumber = new Random();
    public static ColorSupplier supplier = new ColorSupplier();
    public static Ball getRandomBall() {
        int number = randomNumber.nextInt(1, 101);
        String color = supplier.getRandomColor();
        return new Ball(number, color);
    }
}
