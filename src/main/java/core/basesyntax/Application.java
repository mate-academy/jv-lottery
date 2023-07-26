package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball ballOne = Lottery.getRandomBall();
        Ball ballTwo = Lottery.getRandomBall();
        Ball ballThree = Lottery.getRandomBall();
        System.out.println(ballOne);
        System.out.println(ballTwo);
        System.out.println(ballThree);
    }
}
