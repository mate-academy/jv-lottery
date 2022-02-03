package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Ball [] balls = new Ball[3];
        for (int i = 0; i < balls.length; i++) {
            Lottery ball = new Lottery();
            balls[i] = ball.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
