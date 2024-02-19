package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball [] setOfBalls = new Ball [3];
        for (int i = 0; i < setOfBalls.length; i++) {
            setOfBalls[i] = new Lottery().getRandomBall();
        }
        System.out.println(Arrays.toString(setOfBalls));
    }
}
