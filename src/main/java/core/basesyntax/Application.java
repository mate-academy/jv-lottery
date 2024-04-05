package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery createBall = new Lottery();

        for (int i = 0; i < 3; i++) {
            Ball ball = createBall.getRandomBall();
            System.out.println(ball);
        }
    }
}
