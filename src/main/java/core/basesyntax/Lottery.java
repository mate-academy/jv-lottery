package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall(){
        Ball ball = new Ball();
        ball.setColor(getRandomBall());
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        return "Ball colour: " + ball.getColor() + "number: " + ball.getNumber();
    }
}
