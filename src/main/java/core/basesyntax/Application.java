package core.basesyntax;

import java.util.Arrays;

public class Application {
    private static final Lottery lottery = new Lottery();

    public static void main(String[] args) {
        Ball[] balls = new Ball[]{lottery.getRandomBall(),
                lottery.getRandomBall(), lottery.getRandomBall()};
        System.out.println(Arrays.toString(balls));
    }
}
