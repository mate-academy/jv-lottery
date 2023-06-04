package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ballFirst = lottery.getRandomBall();
        Ball ballSecond = lottery.getRandomBall();
        Ball ballThird = lottery.getRandomBall();
        System.out.println("Ball 1 = " + ballFirst);
        System.out.println("Ball 2 = " + ballSecond);
        System.out.println("Ball 3 = " + ballThird);
    }
}
