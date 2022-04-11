package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int countOfBalls = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < countOfBalls; i++) {
            System.out.println(lottery.getRandomBall().toString());
        }
    }
}
