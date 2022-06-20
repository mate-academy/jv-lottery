package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] randomBalls = new Ball[3];
        for (int i = 0; i < randomBalls.length; i++) {
            randomBalls[i] = new Ball();
        }
        for (int i = 0; i < randomBalls.length; i++) {
            randomBalls[i] = randomBalls[i].getRandomBall();
        }
        for (int i = 0; i < randomBalls.length; i++) {
            System.out.println(randomBalls.toString());
        }
    }
}