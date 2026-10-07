package core.basesyntax;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        Lottery lottery = new Lottery();
        Random random = new Random();

        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall(random);
            System.out.println(balls[i]);
        }
    }
}
