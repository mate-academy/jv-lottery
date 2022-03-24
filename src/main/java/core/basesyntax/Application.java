package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lotery ball = new Lotery();
        for (int i = 0; i < 3; i++) {
            System.out.println(ball.getRandomBall());
        }
    }
}
