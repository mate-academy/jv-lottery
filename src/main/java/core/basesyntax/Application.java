package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball firstBall = lottery.getRandomBall();
        Ball secondBall = lottery.getRandomBall();
        Ball thirdBall = lottery.getRandomBall();

        System.out.println("First ball => " + firstBall.toString());
        System.out.println("Second ball => " + secondBall.toString());
        System.out.println("Third ball => " + thirdBall.toString());
    }
}
