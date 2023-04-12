package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int count = 0;
        Lottery lucky = new Lottery();
        for (int i = 0; i < 3; i++) {
            count++;
            String n = String.valueOf(count);
            System.out.println("Ball " + n + ": " + lucky.getRandomBall());
        }

    }
}
