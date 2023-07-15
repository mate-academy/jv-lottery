package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String  getRandomBall(){
        Ball ball = new Ball();
        ball.color = String.valueOf(new ColorSupplier().getRandomColor());
        ball.number = new Random().nextInt(100);
        return "Ball{" +
                "color='" + ball.color + '\'' +
                ", number=" + ball.number +
                '}';
    }

}
