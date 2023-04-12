package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lucky = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ball " + (i + 1) + ": " + lucky.getRandomBall());
        }

    }
}
