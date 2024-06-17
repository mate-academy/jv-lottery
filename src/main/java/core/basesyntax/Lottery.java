package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        Ball ball = new Ball();
        ball.setNumber(randomNumber);
        ball.setColour(color);

        return ball.toString();
    }


}
