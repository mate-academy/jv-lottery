package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();
        var lotteryBasket = new Object[]{ball1, ball2, ball3};
        Arrays.stream(lotteryBasket).forEach(System.out::println);
    }
}
