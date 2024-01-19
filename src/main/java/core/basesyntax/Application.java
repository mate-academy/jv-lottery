package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        String[] lotteries = new String[3];
        for (int i = 0; i < lotteries.length; i++) {
            lotteries[i] = lottery.getRandomBall();
        }
        System.out.println(Arrays.toString(lotteries));
    }
}
