package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball = new Ball();
        for (int i = 0; i < 3; i++) {
            ball = new Lottery().getRandomBall();
            System.out.println(ball);
        }
    }
}
