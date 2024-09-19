package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        final int ballsLength = 3;
        Ball[] balls = new Ball[ballsLength];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
