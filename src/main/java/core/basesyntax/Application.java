package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball firstBall = Lottery.getRandomBall();
        Ball secondBall = Lottery.getRandomBall();
        Ball thirdBall = Lottery.getRandomBall();

        System.out.println("First ball: " + firstBall
                           + "\nSecond ball: " + secondBall
                           + "\nThird ball: " + thirdBall);
    }
}
