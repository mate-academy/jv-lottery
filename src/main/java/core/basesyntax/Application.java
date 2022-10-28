package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball firstBall = lottery.getRandomBall();
        Ball secondBall = lottery.getRandomBall();
        Ball thirdBall = lottery.getRandomBall();

        System.out.println(firstBall);
        System.out.println(secondBall);
        System.out.println(thirdBall);
        // create three balls using class Lottery and print information about them in console
    }
}

