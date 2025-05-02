package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final Lottery lottery = new Lottery();
        System.out.println("Three Random Balls:");
        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
