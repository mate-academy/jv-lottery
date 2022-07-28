package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery[] balls = new Lottery[] {new Lottery(), new Lottery(), new Lottery()};
        for ( Lottery ball : balls) {
            System.out.println(ball.getRandomBall());
        }
    }
}
