package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball firstBall = Lottery.getRandomBall();
        System.out.println(firstBall.toString());
        Ball secondBall = Lottery.getRandomBall();
        System.out.println(secondBall.toString());
        Ball thirdBall = Lottery.getRandomBall();
        System.out.println(thirdBall.toString());
    }
}
