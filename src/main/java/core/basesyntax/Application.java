package core.basesyntax;

public class Application {
    static final int THREE_BALL = 3;

    public static void main(String[] args) {
        Lottery lucky = new Lottery();
        for (int i = 0; i < THREE_BALL; i++) {
            System.out.println("Ball " + (i + 1) + ": " + lucky.getRandomBall());
        }
    }
}
