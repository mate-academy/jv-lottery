package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball firstBall = lottery.GetRandomBall();
        Ball secondBall = lottery.GetRandomBall();
        Ball thirdBall = lottery.GetRandomBall();
        System.out.println(firstBall);
        System.out.println(secondBall);
        System.out.println(thirdBall);
    }
}
