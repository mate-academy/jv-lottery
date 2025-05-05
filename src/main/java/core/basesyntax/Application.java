package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery[] firstBall = {new Lottery(), new Lottery(), new Lottery()};
        for (Lottery ball : firstBall) {
            System.out.println(ball.getRandomBall().toString());
        }
    }
}
