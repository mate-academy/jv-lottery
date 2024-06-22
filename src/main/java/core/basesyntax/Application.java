package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ballFirst = lottery.getRandomBall();
        System.out.println(ballFirst);
        Ball ballSecond = lottery.getRandomBall();
        System.out.println(ballSecond);
        Ball ballThird = lottery.getRandomBall();
        System.out.println(ballThird);
    }
}