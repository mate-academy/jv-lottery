package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        int numberRandom = new Random().nextInt(100);
        ColorSupplier supplier = new ColorSupplier();
        String randomColor = supplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(randomColor);
        ball.setNumber(numberRandom);
        return ball.toString();
    }
}
