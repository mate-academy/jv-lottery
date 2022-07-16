package core.basesyntax;

public class Application {
    public static void main(String[] args) {
    Ball ballfirst = Lottery.getRandomBall();
    Ball ballsecond = Lottery.getRandomBall();
    Ball ballthird = Lottery.getRandomBall();
    System.out.println(ballfirst);
    System.out.println(ballsecond);
    System.out.println(ballthird);
    }
}
