package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery[] list = new Lottery[3];
        list[0] = new Lottery();
        list[1] = new Lottery();
        list[2] = new Lottery();
        for (Lottery sample : list) {
            System.out.println(sample.getRandomBall());
        }
    }
}

