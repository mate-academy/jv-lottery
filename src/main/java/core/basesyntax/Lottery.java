package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int Max_Ball_Number = 100;
    private static final Random RANDOM = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();  
   
    public Ball getRandomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor(), RANDOM.nextInt(Max_Ball_Number) + 1);

        return ball;
    }

}
