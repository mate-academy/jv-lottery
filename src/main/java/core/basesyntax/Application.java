package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball firstBall = lottery.getRandomBall();
        Ball secondBall = lottery.getRandomBall();
        Ball thirdBall = lottery.getRandomBall();

        System.out.println("First Ball is " + firstBall);
        System.out.println("Second Ball is " + secondBall);
        System.out.println("Third Ball is " + thirdBall);
    }
}
