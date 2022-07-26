package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstAttempt = new Lottery();
        Lottery secondAttempt = new Lottery();
        Lottery thirdAttempt = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(firstAttempt.getRandomBall()
                    + secondAttempt.getRandomBall()
                    + thirdAttempt.getRandomBall());
        }
    }
}
