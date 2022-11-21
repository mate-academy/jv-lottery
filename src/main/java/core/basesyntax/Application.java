package core.basesyntax;

import java.util.Arrays;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i <= 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}

//To test the program, in main() method, create three balls using getRandomBall() method
// from Lottery class. And print information about them in the console.