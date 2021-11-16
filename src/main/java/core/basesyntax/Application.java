package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0;i < 3;i++) {
            Ball ball = new Ball();
            Lottery lott = new Lottery();
            ball = lott.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
