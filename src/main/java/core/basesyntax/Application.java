package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int piecesBall = 3;
        for (int i = 1; i <= piecesBall; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
