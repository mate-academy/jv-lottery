package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball firstBall = lottery.getRandomBall();
        Ball secondBall = lottery.getRandomBall();
        Ball thirdBall = lottery.getRandomBall();
        System.out.println("First ball: " + firstBall);
        System.out.println("Second ball: " + secondBall);
        System.out.println("Third ball: " + thirdBall);
        // create three balls using class Lottery and print information about them in console
    }
}
