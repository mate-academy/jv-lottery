package basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall(){
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(randomNumber);
        return ball;
    }
}
