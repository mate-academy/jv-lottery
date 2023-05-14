package core.basesyntax;

import java.util.Random;


public class Lottery extends Ball {

    public Lottery getRandomBall() {

        Random random = new Random();
        int numberOfBall = random.nextInt(100);

        Lottery ball = new Lottery();
        ball.setNumber(numberOfBall);
        ball.setColor(ball.getRandomColor());

        return ball;

    }

}
