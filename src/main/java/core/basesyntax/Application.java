package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball ballOne = lottery.getRandomBall();
        Ball ballTwo = lottery.getRandomBall();
        Ball ballThree = lottery.getRandomBall();
        System.out.println(ballOne.toString());
        System.out.println(ballTwo.toString());
        System.out.println(ballThree.toString());
    }
}
