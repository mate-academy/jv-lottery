package core.basesyntax;

public class Application {
    private static int countBall = 3;

    public static void main(String[] args) {
        while (countBall > 0) {
            System.out.println(Lottery.getRandomBall());
            countBall--;
        }
    }
}
