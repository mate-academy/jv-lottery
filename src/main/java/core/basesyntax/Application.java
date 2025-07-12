package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        final int ballsToCreate = 3;
        Ball[] array = new Ball[ballsToCreate];
        for (int i = 0; i < ballsToCreate; i++) {
            array[i] = lottery.getRandomBall();
            System.out.println(array[i]);
        }
    }
}
