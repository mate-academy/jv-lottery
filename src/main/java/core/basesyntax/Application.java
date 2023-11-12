package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Lottery bal = new Lottery();

        Ball ball1 = bal.getRandomBall();
        Ball ball2 = bal.getRandomBall();
        Ball ball3 = bal.getRandomBall();

        for (Ball ball : Arrays.asList(ball1, ball2, ball3)) {
            System.out.println(ball);
        }

    }
}
