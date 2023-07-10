package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        String[] ball1 = new String[3];
        for (int i = 0; i < ball1.length; i++) {
            ball1[i] = (new Lottery().getRandomBall()).toString();
        }
        System.out.println(Arrays.toString(ball1));
    }
}
