package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int MaxValue = 3;
        for (int i = 0; i < MaxValue; i++) {
            Lottery ball = new Lottery();
            System.out.println(ball.getRandomBall());
        }

    }
}
