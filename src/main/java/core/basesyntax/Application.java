package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball firstBall = lottery.getRandomBall();
        Ball secondBall = lottery.getRandomBall();
        Ball thirdBall = lottery.getRandomBall();

        System.out.println("Ball 1: " + firstBall);
        System.out.println("Ball 2: " + secondBall);
        System.out.println("Ball 3: " + thirdBall);
    }
}
