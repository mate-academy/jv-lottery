package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Lottery firstBalls = new Lottery();
        Lottery secondBalls = new Lottery();
        Lottery thirdBalls = new Lottery();
        firstBalls.getRandomBall();
        secondBalls.getRandomBall();
        thirdBalls.getRandomBall();
        Lottery [] lotteries = new Lottery [] {firstBalls, secondBalls, thirdBalls};
        System.out.println(Arrays.toString(lotteries));
    }
}
