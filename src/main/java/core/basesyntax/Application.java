package core.basesyntax;

import core.basesyntax.constructors.Lottery;
public class Application {
    public static void main(String[] args) {
        Lottery ballOne = new Lottery();
        Lottery ballTwo = new Lottery();
        Lottery ballThree = new Lottery();

        System.out.println(ballOne.getRandomBall());
        System.out.println(ballTwo.getRandomBall());
        System.out.println(ballThree.getRandomBall());
    }
}
