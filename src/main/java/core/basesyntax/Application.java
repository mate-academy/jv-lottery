package core.basesyntax;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Lottery lottery = new Lottery(new ColorSupplier(new Random()), new Random());
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
