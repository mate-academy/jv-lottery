package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int a = 0; a < 3; a++) {
            Ball ball = new Ball();
            ball = new Lottery().getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
