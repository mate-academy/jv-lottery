package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstBall = new Lottery();
        Lottery secondBall = new Lottery();
        Lottery thirdBall = new Lottery();

        Lottery[] randomThreeBalls = new Lottery[]{firstBall, secondBall, thirdBall};
        for (Lottery balls : randomThreeBalls) {
            System.out.println(balls.getRandomBall());
        }

    }
}
