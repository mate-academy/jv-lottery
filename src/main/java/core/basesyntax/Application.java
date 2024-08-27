package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int MAX_VALUE = 3;
        for (int i = 0; i < MAX_VALUE; i++) {
            Lottery ball = new Lottery();
            System.out.println(ball.getRandomBall());
        }

    }
}
