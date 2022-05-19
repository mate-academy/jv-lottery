package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        String color = getRandomColor();
        int number = new Random().nextInt(100);
        return new Ball(number, color);
    }
}
