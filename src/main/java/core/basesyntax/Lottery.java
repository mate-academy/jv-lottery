package core.basesyntax;

import java.util.Random;

public class Lottery {
    public void getRandomBall(){
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumber = new Random();

        ball.number = randomNumber.nextInt(100);
        ball.color = colorSupplier.getRandomColor();

    }
}
