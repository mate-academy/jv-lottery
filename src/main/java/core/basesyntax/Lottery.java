package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_VALUE = 100;

    public String getRandomBall() {
        Random random = new Random();
        int numberRandomBall = random.nextInt(MAX_VALUE);
        ColorSupplier colorRandomBall = new ColorSupplier();
        String randomColor = colorRandomBall.getRandomColor();
        return new Ball(randomColor, numberRandomBall).toString();
    }
}
