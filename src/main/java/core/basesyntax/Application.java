package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int ball = 3;
        Lottery lottery = new Lottery();
        while (ball > 0) {
            System.out.println(lottery.getRandomBall());
            ball--;
        }
    }
}
