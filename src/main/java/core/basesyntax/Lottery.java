package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier color = new ColorSupplier();

    public String getRandomBall() {

        Random random = new Random();
        int number = random.nextInt(100);
        StringBuilder ball = new StringBuilder();
        ball.append(color.getRandomColor()).append(" ").append(number);
        return ball.toString();
    }
}
