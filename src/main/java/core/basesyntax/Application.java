package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ballFirst = new Lottery().getRandomBall();
        Ball ballSecond = new Lottery().getRandomBall();
        Ball ballThird = new Lottery().getRandomBall();
        System.out.println(ballFirst);
        System.out.println(ballSecond);
        System.out.println(ballThird);
    }
}
