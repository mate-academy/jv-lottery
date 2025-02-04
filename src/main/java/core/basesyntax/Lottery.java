package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(101); // Число от 0 до 100
        return new Ball(color, number);
    }
}
