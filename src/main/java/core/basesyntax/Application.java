package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(colorSupplier);

        String[] answer = new String[3];

        for (int i = 0; i < 3; i++) {
            answer[i] = String.valueOf(lottery.getRandomBall());
        }
        System.out.println(Arrays.toString(answer));
    }
}
