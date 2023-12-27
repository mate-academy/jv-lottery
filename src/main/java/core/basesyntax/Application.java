package core.basesyntax;

import java.util.Arrays;

public class Application {
    private static final int BALLS_LENGTH = 3;

    public static void main(String[] args) {
        Loterry loterry = new Loterry();
        Ball[] balls = new Ball[BALLS_LENGTH];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = loterry.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
