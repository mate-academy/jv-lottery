package core.basesyntax;

public class Application {
    static final int NUMBER = 3;

    public static void main(String[] args) {

        for (int i = 0; i <= NUMBER; i++) {
            Ball ball = new Lottery().getRandomBall();
            System.out.println(ball);
        }
    }
}
