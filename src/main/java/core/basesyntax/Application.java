package core.basesyntax;
public class Application {
    public static void main(String[] args) {
        Ball firstBall = Lottery.getRandomBall();
        System.out.println(firstBall);
        Ball secondBall = Lottery.getRandomBall();
        System.out.println(secondBall);
        Ball thirdBall = Lottery.getRandomBall();
        System.out.println(thirdBall);
    }
}
