package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball1 = Lottery.getRandomBall();
        Ball ball2 = Lottery.getRandomBall();
        Ball ball3 = Lottery.getRandomBall();

        System.out.println("Ball1: " + ball1);
        System.out.println("Ball2: " + ball2);
        System.out.println("Ball3: " + ball3);
    }
}
