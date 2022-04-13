package core.basesyntax;

import java.util.Random;

class Lottery extends Ball{
    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        int index = random.nextInt(100);
        ball.setNumber(index);
        ColorSupplier supplier = new ColorSupplier();
        String color = String.valueOf(supplier.getRandomColor());
        ball.setColor(color);
        return ball;
    }
}
