package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final byte numberOfIteration = 3;
        Lottery lottery = new Lottery();

        for (int i = 0; i < numberOfIteration; i++){
            Ball randomBall = lottery.getRandomBall();
            System.out.println(randomBall.toString());
        }
    }
}
