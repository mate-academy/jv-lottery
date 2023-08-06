package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lot = new Lottery();
        System.out.println(lot.getRandomBall());
    }
}
