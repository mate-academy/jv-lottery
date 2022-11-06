package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int numberRandom = new Random().nextInt(100);

    public String getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Color randomColor = supplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(randomColor);
        ball.setNumber(numberRandom);
        return ball.toString();
    }
}
