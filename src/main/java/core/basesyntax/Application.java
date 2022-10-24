package core.basesyntax;

import java.util.Arrays;

public class Application {
    private static final int AMOUNT_BALLS = 3;

    public static void main(String[] args) {
        Lottery bal = new Lottery();
        Ball[] bals = new Ball[AMOUNT_BALLS];
        for (int i = 0; i < bals.length; i++) {
            bals[i] = bal.getRandomBall();
        }
        System.out.println(Arrays.toString(bals));
    }
}
