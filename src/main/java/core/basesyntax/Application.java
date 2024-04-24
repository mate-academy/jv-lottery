package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball firstBall = Lottery.getRandomBall();
        Ball secondBall = Lottery.getRandomBall();
        Ball thirdBall = Lottery.getRandomBall();

        System.out.println(firstBall);
        System.out.println(secondBall);
        System.out.println(thirdBall);
    }
}
