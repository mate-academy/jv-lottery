package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];

        for (int i = 0; i < 3; i++) {
            balls[i] = new Lottery().getRandomBall();
        }

        System.out.println(Arrays.toString(balls));
    }
}
