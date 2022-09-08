package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public String getRandomBall() {
        ColorSupplier colSup = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor(colSup.getRandomColor().toString());

        Random index = new Random();
        ball.setNumber(index.nextInt(100));

        return "Color: " + ball.getColor() + " number: " + ball.getNumber();

    }
}
