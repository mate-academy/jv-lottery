package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxBound = 100;//range random 0...100
    private Random random = new Random();//new class instance random
    private ColorSupplier colorSupplier = new ColorSupplier();//new class instance colorSupplier

    public Ball getRandomBall() {
        int randomNumberBall = random.nextInt(maxBound);
        Ball ball = new Ball();
        ball.setNumber(randomNumberBall);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }

}
