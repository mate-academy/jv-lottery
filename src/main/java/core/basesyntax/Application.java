package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball1 = Lottery.getRandomBall();
        System.out.println("Ball 1: " + ball1);
        Ball ball2 = Lottery.getRandomBall();
        System.out.println("Ball 2: " + ball2);
        Ball ball3 = Lottery.getRandomBall();
        System.out.println("Ball 3: " + ball3);
    }
}
