package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] winners = new Ball[3];
        for (int i = 0; i < winners.length; i++) {
            winners[i] = new Lottery().getRandomBall();
            System.out.println(winners[i]);
        }
    }
}
