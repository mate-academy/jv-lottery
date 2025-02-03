package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Random number = new Random();
        StringBuilder ball = new StringBuilder();
        ball.append(number.nextInt(100))
                .append(" ")
                .append(color.getRandomColor().toString());
        return ball.toString();
    }
}
