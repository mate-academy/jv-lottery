package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static String getRandomBall(){
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        ball.color = color.getRandomColor();
        Random random = new Random();
        ball.number = random.nextInt(100);
        return "Number Ball: " + ball.number + " Color Ball: " + ball.color;
    }
}
