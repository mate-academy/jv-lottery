package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery newBall = new Lottery();

        Lottery[] randomThreeBalls = new Lottery[]{newBall, newBall, newBall};
        for (Lottery balls : randomThreeBalls) {
            System.out.println(balls.getRandomBall());
        }

    }
}
