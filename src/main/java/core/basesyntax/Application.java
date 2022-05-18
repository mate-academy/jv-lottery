package core.basesyntax;

//import java.util.Random;

public class Application {
    public Application() {
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            lottery.getRandomBall();
            System.out.println(lottery.getRandomBall());
        }
    }
}




