package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Lottery lot = new Lottery();
        for (int i = 0; i < 7; i++) {
            System.out.println(lot.getRandomBall());
        }
    }
}
