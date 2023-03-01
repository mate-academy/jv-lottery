package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier=new ColorSupplier();
    Random random =new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(100);
        Ball ball = new Ball(color, number);
        return ball;
    }
}
