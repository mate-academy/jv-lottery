package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball firstBall = Lottery.getRandomBall();
        Ball secondBall = Lottery.getRandomBall();
        Ball thirdBall = Lottery.getRandomBall();
        System.out.println(firstBall);
        System.out.println(secondBall);
        System.out.println(thirdBall);
        // create three balls using class Lottery and print information about them in console
    }
}
