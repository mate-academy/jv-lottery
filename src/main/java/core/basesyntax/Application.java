package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        String[] winners = new String[3];
        for (int i = 0; i < winners.length; i++) {
            winners[i] = getRandomBall();
            System.out.println(winners[i]);
        }
    }
}
