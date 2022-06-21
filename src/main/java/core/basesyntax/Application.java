package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new  Lottery();
        int ball = 3;
        while (ball > 0) {
            System.out.println(lottery.getRandomBall());
            ball --;
        }
    }
}
