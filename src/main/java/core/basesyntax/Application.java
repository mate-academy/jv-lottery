package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        printThreeRandomBalls();
    }

    public static void printThreeRandomBalls() {
        System.out.println("Three Random Balls:");
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
