package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball1 = Lottery.getRandomBall();
        Ball ball2 = Lottery.getRandomBall();
        Ball ball3 = Lottery.getRandomBall();
        ball1.print();
        ball2.print();
        ball3.print();
    }
}
