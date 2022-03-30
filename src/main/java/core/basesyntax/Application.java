package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int numberOfIteration = 3;
        for (int i = 0; i < numberOfIteration; i++) {
            System.out.println(lottery.getRandomBall().getToString());
        }
    }
}
