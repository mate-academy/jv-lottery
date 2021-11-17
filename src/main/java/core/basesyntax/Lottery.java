package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
       Ball ball = new Ball();
       ball.color = new ColorSupplier().getRandomColor();
       ball.number = new Random().nextInt(100);
       return ball.toString();
    }
}
