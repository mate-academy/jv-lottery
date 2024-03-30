package core.basesyntax;

import core.basesyntax.entity.Ball;

public class Application {
    public static void main(String[] args) {
        Ball firstBall = Lottery.getRandomBall();
        Ball secondBall = Lottery.getRandomBall();
        Ball thirdBall = Lottery.getRandomBall();

        System.out.println(firstBall.toString());
        System.out.println(secondBall.toString());
        System.out.println(thirdBall.toString());
    }
}
