package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int ball = 3;
        while (ball > 0) {
            System.out.println(Lottery.getRandomBall());
            ball--;
        }
    }
}
