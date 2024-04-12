package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            lottery.getRandomBall();
        }
    }
}
