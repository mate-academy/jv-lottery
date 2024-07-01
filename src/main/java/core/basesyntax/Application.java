package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int countBall = 3;
        while (countBall > 0) {
            Lottery lottery = new Lottery();
            System.out.println(lottery.getRandomBall());
            countBall--;
        }
    }
}
