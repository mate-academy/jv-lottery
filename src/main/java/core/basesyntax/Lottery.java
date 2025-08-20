package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static String getRandomBall() {
        Random random = new Random();
        int randomNumberBall = random.nextInt(100);

        ColorSupplier randomColor = new ColorSupplier();

        return ("Number of ball Is: " + randomNumberBall
                + ", color: " + randomColor.getRandomColor());
    }
}
