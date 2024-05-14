package core.basesyntax;

import static core.basesyntax.Lottery.getRandomBall;

public class Application {
    public static void main(String[] args) {
        Ball ball1 = getRandomBall();
        Ball ball2 = getRandomBall();
        Ball ball3 = getRandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
