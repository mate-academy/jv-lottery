package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Lottery bal = new Lottery();
        Ball[] bals = new Ball[3];
        for (int i = 0; i < bals.length; i++) {
            bals[i] = bal.getRandomBall();
        }
        System.out.println(Arrays.toString(bals));
    }
}
