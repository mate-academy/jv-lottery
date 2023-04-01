package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball;
        for (int a = 0; a < 3; a++) {
            ball = new Lottery().getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
