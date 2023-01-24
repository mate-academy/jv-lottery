package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier color1 = new ColorSupplier();

    public static String getRandomBall(String color1) {
        Random random = new Random();
        int intValue = random.nextInt(100);
        StringBuilder ball = new StringBuilder();
        ball.append(color1).append(" ").append(intValue);
        return ball.toString();
    }
}
