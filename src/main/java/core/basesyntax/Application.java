package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int ballsToCreate = 3;
        Lottery lottery = new Lottery();
        for (int i = 1; i <= ballsToCreate; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
