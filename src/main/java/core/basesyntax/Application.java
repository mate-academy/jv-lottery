package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Lottery randomBall = new Lottery();
            String message = "preffix " + randomBall.getRandomBall();
            System.out.println(randomBall.getRandomBall().toString());
        }

    }
}
