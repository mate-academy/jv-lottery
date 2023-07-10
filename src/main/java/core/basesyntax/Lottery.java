package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        ColorSupplier color = new ColorSupplier();
        String ball = (color.getRandomColor()).toString() + " " + number;
        return ball;
    }
}
