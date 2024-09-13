package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball randomBall = new Ball();
        StringBuilder resultOf3 = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            randomBall = lottery.getRandomBall();
            System.out.println(randomBall.toString());
        }
    }
}
