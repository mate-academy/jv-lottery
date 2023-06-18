package core.basesyntax;

import java.util.Random;

class Lottery {

    public static Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1;
        return new Ball(color.name(), number);
    }
}
