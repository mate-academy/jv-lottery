package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery youCanWinMillionDollars = new Lottery();
        int i = 0;
        while (i < 3) {
            System.out.println(youCanWinMillionDollars.getRandomBall());
            i++;
        }
    }
}
