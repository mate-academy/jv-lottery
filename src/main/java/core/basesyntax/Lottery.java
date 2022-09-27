package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        Color randomColor = supplier.getRandomColor();
        Random rnd = new Random();
        int sum = rnd.nextInt(100);
        ball.setColor(randomColor);
        ball.setNumber(sum);
        return ball;
    }
}
