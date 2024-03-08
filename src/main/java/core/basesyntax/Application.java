package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery[] lots = new Lottery[]{ new Lottery(), new Lottery(), new Lottery() };
        for (Lottery lot : lots) {
            System.out.println(lot.getRandomBall().toString());
        }
    }
}
