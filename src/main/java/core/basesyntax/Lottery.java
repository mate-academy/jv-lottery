package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall(){
        Ball ball= new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.color = String.valueOf(colorSupplier.getRandomColor());
        Random number = new Random();
        ball.number = number.nextInt(101);
        return ball;
    }
}
