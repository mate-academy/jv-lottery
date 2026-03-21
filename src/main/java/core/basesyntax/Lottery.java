package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        String color = new ColorSupplier().getRandomColor();
        Random random = new Random();
        int ball = random.nextInt(100);
        return color + " " + ball;
    }
}
