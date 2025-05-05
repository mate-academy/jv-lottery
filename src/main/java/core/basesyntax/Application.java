package core.basesyntax;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        var lotteryBasket = new Object[3];
        for (int i = 0; i < 3; i++) {
            lotteryBasket[i] = lottery.getRandomBall();
        }
        Arrays.stream(lotteryBasket).forEach(System.out::println);
    }
}
