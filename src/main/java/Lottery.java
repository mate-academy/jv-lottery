import core.basesyntax.ColorSupplier;

import java.util.Random;
public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public void getRandomBall(){
        int number = random.nextInt(100);
        Ball ball = new Ball(colorSupplier.getRandomColor(), number);
        return ball.toString();
    }
}
