package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        int numberOfBallsToGenerate = 3;

        for (int i = 0; i < numberOfBallsToGenerate; i++) {
            System.out.println(lottery.getRandomBall().toString());
        }
    }
}
