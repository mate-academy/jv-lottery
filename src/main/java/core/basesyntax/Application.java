package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball[] balls = {lottery.getRandomBall(), lottery.getRandomBall(), lottery.getRandomBall()};
        System.out.println(Arrays.toString(balls));
    }
}
