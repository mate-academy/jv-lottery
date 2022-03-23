package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery randomBall = new Lottery();
        for (int i = 1; i <= 3; i++) {
            System.out.println(randomBall.getRandomBall().toString());
        }
    }
}
