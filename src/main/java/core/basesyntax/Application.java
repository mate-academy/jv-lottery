package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball firstBall = lottery.getRandomBall();
        System.out.println(firstBall);
        Ball secondBall = lottery.getRandomBall();
        System.out.println(secondBall);
        Ball thirdBall = lottery.getRandomBall();
        System.out.println(thirdBall);
    }
}
