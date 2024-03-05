package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomball() {
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();

        return new Ball(randomColor, randomNumber);
    }
}
