package core.basesyntax;

import java.util.Random;

public class Lottery {
     ColorSupplier colorSupplier = new ColorSupplier();
     Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1; 
        return new Ball(color, number);
    }
}
