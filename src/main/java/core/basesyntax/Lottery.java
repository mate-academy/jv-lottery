package core.basesyntax;

import java.util.Random;

public class Lottery {

    private Ball ball = new Ball(getRandomColor(), getRandomNumber());
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomNumber() {
        return new Random().nextInt(100);
    }

    public String getRandomColor() {
        return colorSupplier.getRandomColor();
    }

    public void getRandomBall() {
        System.out.println(ball.toString());
    }
}
