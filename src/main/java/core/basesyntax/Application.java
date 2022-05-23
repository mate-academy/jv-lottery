package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[3];
        for (int i = 0; i < 3; i++) {
            balls[i] = new Ball();
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
